package org.javatop.mp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.javatop.mp.domain.Emp;
import org.javatop.mp.service.EmpService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-03-23 0:23
 * @description :
 */
@SpringBootTest(classes = MyBatisPlusApplication.class)
@RunWith(SpringRunner.class)
public class BasicTests {

    @Resource
    private EmpService empService;


    /**
     *  用于测试: 查询所有用户
     */
    @Test
    public void testSelectAll() {
        List<Emp> empList = empService.list();
        empList.forEach(System.out::println);
    }

    /**
     *  用于测试: 查询单个员工
     */
    @Test
    public void testSelectOne() {
        Emp emp = empService.getOne(new QueryWrapper<Emp>().eq("name", "Leo哥"));
        System.out.println("emp = " + emp);
    }


    /**
     *  用于测试: 添加员工
     */
    @Test
    public void testSave() {
        Emp emp = new Emp();
        emp.setId(10L);
        emp.setName("hhh");
        emp.setAge(0);
        boolean save = empService.save(emp);
        System.out.println("save = " + save);
    }

    /**
     *  用于测试: 更新员工
     */
    @Test
    public void testUpdate() {
        Emp emp = new Emp();
        emp.setId(10L);
        emp.setName("jiujiu");
        emp.setAge(10);
        boolean save = empService.updateById(emp);
        System.out.println("save = " + save);
    }

    /**
     *  用于测试: 删除员工
     */
    @Test
    public void testDelete() {
        boolean b = empService.removeById(10L);
        System.out.println("b = " + b);
    }
}
