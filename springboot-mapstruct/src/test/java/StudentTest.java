import org.javatop.mapstruct.MapStructApplication;
import org.javatop.mapstruct.domain.Student;
import org.javatop.mapstruct.domain.StudentVO;
import org.javatop.mapstruct.domain.StudentVO2;
import org.javatop.mapstruct.mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-02-20 13:52
 * @description :
 */

@SpringBootTest(classes = {MapStructApplication.class})
public class StudentTest {


    /**
     *  用于测试:01
     */
    @Test
    public void test01() {
        Student student = new Student("张三", 18);
        StudentVO studentVO = StudentMapper.INSTANCE.tostudentVO(student);
        System.out.println("studentVO = " + studentVO);
    }


    /**
     *  用于测试:02
     */
    @Test
    public void test02() {
        Student student = new Student("李四", 18);
        StudentVO2 studentVO2 = StudentMapper.INSTANCE.tostudentVO2(student);
        System.out.println("studentVO2 = " + studentVO2);
    }

}
