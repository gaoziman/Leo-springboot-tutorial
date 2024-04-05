package org.javatop.validator.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-05 23:00
 * @description :
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "bt")
public class ConfProperties {
    private String v1;

    private String v2;

    private User user;
}
