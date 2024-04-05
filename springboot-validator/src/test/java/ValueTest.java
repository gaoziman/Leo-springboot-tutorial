import lombok.Getter;
import org.javatop.validator.ValidatorApplication;
import org.javatop.validator.properties.ConfProperties;
import org.javatop.validator.properties.ConfProperties2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

import javax.annotation.Resource;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-05 22:29
 * @description :
 */
@SpringBootTest(classes = ValidatorApplication.class)
public class ValueTest {

    @Value("${val.name:Leo}")
    private String name;



    @Value("${JAVA_HOME}")
    private String javaHome;

    @Value("#{systemProperties['user.home']}")
    private String userHome;

    @Getter
    private  static  int age;

    @Value("${val.age}")
    // private static int age;
    public void setAge(String age) {
        age = age;
    }


    @Resource
    private ConfProperties confProperties;

    @Autowired
    private Environment env;


    /**
     *  用于测试:
     */
    @Test
    public void test01() {
        // System.out.println(name);
        //
        // System.out.println(javaHome);
        // System.out.println(userHome);

        System.out.println("age==" + age);
    }

    /**
     *  用于测试:02
     */
    @Test
    public void test02() {
        System.out.println(confProperties);
    }


    /**
     *  用于测试:03
     */
    @Test
    public void test03() {
        String propertyValue = env.getProperty("bt.user.name");
        System.out.println("Property Value: " + propertyValue);
    }

}
