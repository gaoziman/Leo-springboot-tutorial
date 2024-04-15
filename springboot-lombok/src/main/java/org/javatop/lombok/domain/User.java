package org.javatop.lombok.domain;

import lombok.AllArgsConstructor;

import java.util.Objects;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-15 22:53
 * @description :
 */
@AllArgsConstructor
public class User {

    /**
     * 主键id
     */
    private int id;
    /**
     * 登录账号
     */
    private String name;
    /**
     * 登录密码
     */
    private String password;
    /**
     * 性别
     */
    private int sex;
    /**
     * 年龄
     */
    private int age;

    public User() {
    }

    public User(int id, String name, String password, int sex, int age) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && sex == user.sex && age == user.age && Objects.equals(name, user.name) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, password, sex, age);
    }
}
