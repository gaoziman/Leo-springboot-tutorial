package org.javatop.proifle.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-01-10 21:13
 * @description :
 */
public class WomanPersonCondition implements Condition {

    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return context.getEnvironment().getProperty("person").equals("女人");
    }
}
