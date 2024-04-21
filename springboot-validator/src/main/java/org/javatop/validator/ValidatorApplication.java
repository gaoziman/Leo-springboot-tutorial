package org.javatop.validator;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-01 18:29
 * @description :
 */
@SpringBootApplication
public class ValidatorApplication {
    public static void main(String[] args) {
            ConfigurableApplicationContext context = SpringApplication.run(ValidatorApplication.class, args);
            Environment environment = context.getBean(Environment.class);

            System.out.println("访问链接：http://myserver:" + environment.getProperty("server.port"));
            System.out.println("(♥◠‿◠)ﾉﾞ  项目启动成功 ლ(´ڡ`ლ)ﾞ \n");
        }
}
