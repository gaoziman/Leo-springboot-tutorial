package org.javatop.validator.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.io.support.PropertySourceFactory;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-05 23:00
 * @description :
 */
@Data
@Configuration
@PropertySources({
        @PropertySource(value = "classpath:application.properties", encoding = "utf-8",factory = YamlPropertySourceFactory.class),
        })
public class ConfProperties2 {
    private String v1;

    private String v2;

    private User user;
}
