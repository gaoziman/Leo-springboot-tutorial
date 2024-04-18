package org.javatop.jpa.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "sys_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @javax.validation.constraints.Size(max = 10)
    @Column(name = "name", length = 10)
    private String name;

    @javax.validation.constraints.Size(max = 6)
    @Column(name = "sex", length = 6)
    private String sex;

    @javax.validation.constraints.Size(max = 20)
    @Column(name = "pwd", length = 20)
    private String pwd;

    @javax.validation.constraints.Size(max = 20)
    @Column(name = "email", length = 20)
    private String email;


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", pwd='" + pwd + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}