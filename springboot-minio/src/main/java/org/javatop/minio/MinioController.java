package org.javatop.minio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

/**
 * @author : Leo
 * @date  2024-03-28 10:23
 * @version 1.0
 * @description :
 */
@SpringBootApplication
public class MinioController {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MinioController.class, args);
        Environment environment = context.getBean(Environment.class);

        System.out.println("访问链接：http://myserver:" + environment.getProperty("server.port"));
        System.out.println("(♥◠‿◠)ﾉﾞ  项目启动成功 ლ(´ڡ`ლ)ﾞ \n");
    }
}
