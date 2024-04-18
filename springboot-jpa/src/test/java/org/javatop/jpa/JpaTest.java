package org.javatop.jpa;

import lombok.extern.slf4j.Slf4j;
import org.javatop.jpa.domain.User;
import org.javatop.jpa.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-17 21:48
 * @description :
 */
@Slf4j
@SpringBootTest(classes = JpaApplication.class)
public class JpaTest {
    @Resource
    private UserService userService;


    /**
     * 用于测试: 查询
     */
    @Test
    public void test01() {
        // 查询所有
        userService.findAllUsers().stream().forEach(user -> log.info("查询所有{}", user));
    }

    /**
     * 用于测试: 添加用户
     */
    @Test
    public void testSave() {
        // 新增数据
        User user = new User();
        user.setName("Leo");
        user.setEmail("leo@123.com");
        user.setPwd("123456");
        User user1 = userService.addUser(user);
        System.out.println("user1 = " + user1);
    }


    /**
     *  用于测试: 删除
     */
    @Test
    public void testDelete() {
        userService.delete(28);

    }


    /**
     *  用于测试: 通过id查询用户
     */
    @Test
    public void test02() {
         User user = userService.findById(29);
         System.out.println("user = " + user);
    }
}
