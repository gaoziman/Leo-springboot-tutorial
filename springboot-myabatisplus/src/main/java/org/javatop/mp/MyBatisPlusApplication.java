package org.javatop.mp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-03-22 23:43
 * @description :
 */
@SpringBootApplication
@MapperScan("org.javatop.mp.mapper")
public class MyBatisPlusApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MyBatisPlusApplication.class, args);
        Environment environment = context.getBean(Environment.class);

        System.out.println("访问链接：http://myserver:" + environment.getProperty("server.port"));
        System.out.println("(♥◠‿◠)ﾉﾞ  项目启动成功 ლ(´ڡ`ლ)ﾞ \n");
    }
}
