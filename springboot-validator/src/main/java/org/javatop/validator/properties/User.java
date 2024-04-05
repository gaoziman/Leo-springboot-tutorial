package org.javatop.validator.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-05 23:12
 * @description :
 */
@Data
@AllArgsConstructor
public class User {
    private String name;
    private Integer age;
    public User() {
        System.out.println("User constructor");
    }
}
