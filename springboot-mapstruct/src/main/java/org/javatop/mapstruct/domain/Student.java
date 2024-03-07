package org.javatop.mapstruct.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-02-20 13:49
 * @description : 原实体类
 */
@Data
@AllArgsConstructor
public class Student {

    private String name;

    private int age;
}
