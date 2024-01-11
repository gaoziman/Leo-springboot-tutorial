package org.javatop.proifle.config;

import org.javatop.proifle.service.Person;
import org.javatop.proifle.service.impl.Man;
import org.javatop.proifle.service.impl.Woman;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-01-10 21:01
 * @description : 配置
 */
@Configuration
public class BeanConfig {
    @Bean("person")
//    @Conditional(ManPersonCondition.class)
    @Profile("man")
    Person man() {
        return new Man();
    }

    @Bean("person")
//    @Conditional(WomanPersonCondition.class)
    @Profile("woman")
    Person woman() {
        return new Woman();
    }
}
