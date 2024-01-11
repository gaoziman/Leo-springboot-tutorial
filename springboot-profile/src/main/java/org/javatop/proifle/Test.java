package org.javatop.proifle;

import org.javatop.proifle.config.BeanConfig;
import org.javatop.proifle.service.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-01-10 21:26
 * @description :
 */
public class Test {

    public static void main(String[] args) {
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//        ctx.getEnvironment().getSystemProperties().put("person", "男人");
//        ctx.register(BeanConfig.class);
//        ctx.refresh();
//        Person person= (Person) ctx.getBean("person");
//        System.out.println(person.getName());

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles("man");
        ctx.register(BeanConfig.class);
        ctx.refresh();
        Person person= (Person) ctx.getBean("person");
        System.out.println(person.getName());
    }
}
