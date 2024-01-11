import org.javatop.proifle.ProfileApplication;
import org.javatop.proifle.config.BeanConfig;
import org.javatop.proifle.service.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-01-11 11:20
 * @description :
 */
@SpringBootTest(classes = ProfileApplication.class)
public class ProfileTest {

    /**
     *  用于测试:
     */
    @Test
    public void test() {
        System.out.println("ProfileTest.test");
    }

    /**
     *  用于测试: springboot条件注解
     */
    @Test
    public void test2() {
        //        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//        ctx.getEnvironment().getSystemProperties().put("person", "男人");
//        ctx.register(BeanConfig.class);
//        ctx.refresh();
//        Person person= (Person) ctx.getBean("person");
//        System.out.println(person.getName());

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles("man");
        ctx.register(BeanConfig.class);
        ctx.refresh();
        Person person= (Person) ctx.getBean("person");
        System.err.println(person.getName());
    }
}
