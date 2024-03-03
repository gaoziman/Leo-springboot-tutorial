import org.javatop.mybatis.MyBatisApplication;
import org.javatop.mybatis.domain.User;
import org.javatop.mybatis.mapper.UserMapper;
import org.javatop.mybatis.mapper.UserMapper2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-03-03 22:08
 * @description :
 */
@SpringBootTest(classes = {MyBatisApplication.class})
public class MyBatisTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserMapper2 userMapper2;

    /**
     *  用于测试: mybatis
     */
    @Test
    public void test01() {
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println("user = " + user);
    }


    /**
     *  用于测试: 注解方式测试
     */
    @Test
    public void test02() {
        User user = userMapper2.selectByPrimaryKey(1);
        System.out.println("user = " + user);
    }

}
