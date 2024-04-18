package org.javatop.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-17 21:27
 * @description :
 */
@SpringBootApplication
public class JpaApplication {
    public static void main(String[] args) {
            ConfigurableApplicationContext context = SpringApplication.run(JpaApplication.class, args);
            Environment environment = context.getBean(Environment.class);

            System.out.println("访问链接：http://localhost:" + environment.getProperty("server.port"));
            System.out.println("(♥◠‿◠)ﾉﾞ  项目启   动成功 ლ(´ڡ`ლ)ﾞ \n");
        }
}
