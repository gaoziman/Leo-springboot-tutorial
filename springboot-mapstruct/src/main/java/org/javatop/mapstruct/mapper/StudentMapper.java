package org.javatop.mapstruct.mapper;

import org.javatop.mapstruct.domain.Student;
import org.javatop.mapstruct.domain.StudentVO;
import org.javatop.mapstruct.domain.StudentVO2;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-02-20 13:42
 * @description :
 */
@Mapper
public interface StudentMapper {

    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);


    StudentVO tostudentVO(Student student);

    @Mappings({
            @Mapping(source = "age", target = "ageVo"),
            @Mapping(source = "name", target = "nameVo")
    })
    StudentVO2 tostudentVO2(Student student);
}
