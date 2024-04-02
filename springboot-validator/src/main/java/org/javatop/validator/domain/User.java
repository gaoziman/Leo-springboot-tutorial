package org.javatop.validator.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-02 21:58
 * @description : 实体类
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private String sex;

    /**
     * 住址
     */
    private String address;

    /**
     * 邮箱
     */
    private String email;
}