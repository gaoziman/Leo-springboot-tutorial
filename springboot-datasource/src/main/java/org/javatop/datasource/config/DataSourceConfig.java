package org.javatop.datasource.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    private static String driver;
    private static String dbUrl;
    private static String dbUsername;
    private static String dbPassword;

    // 静态方法设置配置信息
    public static void setDataSourceProperties(String driver, String dbUrl, String dbUsername, String dbPassword) {
        DataSourceConfig.driver = driver;
        DataSourceConfig.dbUrl = dbUrl;
        DataSourceConfig.dbUsername = dbUsername;
        DataSourceConfig.dbPassword = dbPassword;
    }

    // 创建静态方法获取数据源
    public static DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(dbUrl);
        dataSource.setUsername(dbUsername);
        dataSource.setPassword(dbPassword);
        return dataSource;
    }

    // 使用@Bean注解注册dataSource_bean
    @Bean
    public DataSource dataSourceBean() {
        return dataSource();
    }
}
