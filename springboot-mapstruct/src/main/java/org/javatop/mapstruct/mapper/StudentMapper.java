package org.javatop.mapstruct.mapper;

import org.javatop.mapstruct.domain.Student;
import org.javatop.mapstruct.domain.StudentVO;
import org.javatop.mapstruct.domain.StudentVO2;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-02-20 13:42
 * @description :
 */
@Mapper(componentModel = "spring")
public interface StudentMapper {

    // 获取StudentMapper接口的实例
    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);


    /**
     * 将Student对象转换为StudentVO对象
     *
     * @param student Student对象
     * @return StudentVO对象
     */
    StudentVO tostudentVO(Student student);

    // 将Student对象转换为StudentVO2对象
    @Mappings({
            // 将Student对象的age属性映射到StudentVO2对象的ageVo属性
            @Mapping(source = "age", target = "ageVo"),
            // 将Student对象的name属性映射到StudentVO2对象的nameVo属性
            @Mapping(source = "name", target = "nameVo")
    })
    StudentVO2 tostudentVO2(Student student);

    /**
     * 将StudentVO类型的List转换为StudentDTO类型的List
     *
     * @param vo StudentVO类型的List
     * @return StudentDTO类型的List
     */
    List<StudentVO> studentListVo2Dto(List<StudentVO> vo);
}
