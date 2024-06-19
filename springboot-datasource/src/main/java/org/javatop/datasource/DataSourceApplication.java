package org.javatop.datasource;

import org.javatop.datasource.config.DataSourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-06-19 11:39
 * @description :
 */
@SpringBootApplication
public class DataSourceApplication {
    public static void main(String[] args) {
        // 设置数据源属性
        DataSourceConfig.setDataSourceProperties(
                "com.mysql.cj.jdbc.Driver",
                "jdbc:mysql://localhost:3306/sqltest?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC",
                "root",
                "gzm2001.."
        );
        ConfigurableApplicationContext context = SpringApplication.run(DataSourceApplication.class, args);
        Environment environment = context.getBean(Environment.class);

        System.out.println("访问链接：http://localhost:" + environment.getProperty("server.port"));
        System.out.println("(♥◠‿◠)ﾉﾞ  项目启动成功 ლ(´ڡ`ლ)ﾞ \n");
    }
}
