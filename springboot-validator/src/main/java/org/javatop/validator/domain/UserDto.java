package org.javatop.validator.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-02 23:34
 * @description : DTO
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {

    public interface Default {
    }

    public interface Group1 {
    }

    private Integer id;

    //注意：@Validated 注解中加上groups属性后,DTO中没有加group属性的校验规则将失效
    @NotEmpty(message = "姓名不能为空", groups = Default.class)
    private String name;

    // 注意：加了groups属性之后，必须在@Validated 注解中也加上groups属性后，校验规则才能生效，不然下面的校验限制就失效了
    @Range(min = 18, max = 50, message = "年龄必须在18和50之间", groups = Default.class)
    @Range(min = 17, message = "年龄必须大于17", groups = Group1.class)
    private Integer age;


    @Email(message = "邮箱格式不正确")
    private String email;

    @Valid
    @NotNull
    private Cat cat;
}
