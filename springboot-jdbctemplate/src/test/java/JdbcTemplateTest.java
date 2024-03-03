import org.javatop.jdbc.JdbcTemplateApplication;
import org.javatop.jdbc.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;

import java.sql.*;
import java.util.List;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-03-02 14:31
 * @description :
 */
@SpringBootTest(classes = {JdbcTemplateApplication.class})
public class JdbcTemplateTest {

    @Autowired
    JdbcTemplate jdbcTemplate;


    /**
     * 用于测试: 添加方法01
     */
    @Test
    public void test01() {
        String sql = "insert into user (id, name, age,sex,address,avatar) values (?, ?,?,?,?,?)";
        User user = new User();
        user.setId(1);
        user.setName("Leo哥");
        user.setAge(18);
        user.setSex("男");
        user.setAddress("北京朝阳");
        user.setAvatar("https://www.javatop.cn/images/logo.png");
        int update = jdbcTemplate.update(sql, user.getId(), user.getName(), user.getAge(), user.getSex(), user.getAddress(), user.getAvatar());
        System.out.println("update = " + update);
    }


    /**
     * 用于测试: 添加方法02
     */
    @Test
    public void test02() {
        GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();
        User user = new User();
        user.setId(3);
        user.setName("lifi2");
        user.setAge(20);
        user.setSex("女");
        user.setAddress("湖南漳州");
        user.setAvatar("https://www.javatop.cn/images/logo.png");
        int update = jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
                String sql = "insert into user (id, name, age,sex,address,avatar) values (?, ?,?,?,?,?)";
                PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setObject(1, user.getId());
                ps.setObject(2, user.getName());
                ps.setObject(3, user.getAge());
                ps.setObject(4, user.getSex());
                ps.setObject(5, user.getAddress());
                ps.setObject(6, user.getAvatar());
                return ps;
            }
        }, keyHolder);
        System.out.println("主键ID = " + keyHolder.getKey().intValue());
        user.setId(keyHolder.getKey().intValue());
    }


    /**
     *  用于测试: 删除方法
     */
    @Test
    public void test03() {
        String sql = "delete from user where id = ?";
        Integer id = 3;
        int update = jdbcTemplate.update(sql, id);
        System.out.println("受影响的行数" + update);
    }

    /**
     *  用于测试: 修改方法
     */
    @Test
    public void test04() {
        String sql = "update user set name = ? where id = ?";
        int update = jdbcTemplate.update(sql, "张三", 2);
        System.out.println("受影响的行数" + update);
    }

    /**
     *  用于测试: 查询方法
     */
    @Test
    public void test05() {
        List<User> list = jdbcTemplate.query("select * from user", new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User();
                Integer id = rs.getInt("id");
                String name = rs.getString("name");
                Integer age = rs.getInt("age");
                String sex = rs.getString("sex");
                String address = rs.getString("address");
                String avatar = rs.getString("avatar");
                user.setId(id);
                user.setName(name);
                user.setAge(age);
                user.setSex(sex);
                user.setAddress(address);
                user.setAvatar(avatar);
                System.out.println("user = " + user);
                return user;
            }
        });
    }
}
