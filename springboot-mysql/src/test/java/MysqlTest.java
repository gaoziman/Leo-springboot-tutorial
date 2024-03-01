import lombok.extern.slf4j.Slf4j;
import org.javatop.mysql.CollectMysqlApplication;
import org.javatop.mysql.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-03-01 20:27
 * @description :
 */

@SpringBootTest(classes = {CollectMysqlApplication.class})
@Slf4j
public class MysqlTest {

    @Resource
    private JdbcTemplate jdbcTemplate;



    /**
     *  用于测试: 连接MySQL
     */
    @Test
    public void test01() {
        String sql ="select * from user";
        List<User> users = jdbcTemplate.query(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setAge(rs.getInt("age"));
                user.setName(rs.getString("name"));
                user.setSex(rs.getString("sex"));
                user.setAddress(rs.getString("address"));
                user.setAvatar(rs.getString("avatar"));
                return user;
            }
        });
        log.info("查询成功");
        users.forEach(p->{
            log.info("用户{}",p);
        });
    }

}
