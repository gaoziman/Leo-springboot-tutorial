package org.javatop.validator.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.validation.annotation.Validated;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-03 00:10
 * @description : Cat类
 */
@Validated
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cat {
    @NotEmpty(message = "姓名不能为空")
    private String name;
    private String color;
}
