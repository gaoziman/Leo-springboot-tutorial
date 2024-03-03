package org.javatop.mybatis.mapper;

import org.apache.ibatis.annotations.*;
import org.javatop.mybatis.domain.User;
import org.springframework.stereotype.Repository;

/**
 * @author : Leo
 * @date  2024-03-03 21:58
 * @version 1.0
 * @description :
 */

@Repository
public interface UserMapper2 {

    @Delete("delete from user where id = #{id}")
    int deleteByPrimaryKey(Integer id);


    @Insert("insert into user (id, name, age) values (#{id}, #{name}, #{age})")
    int insert(User record);


    @Insert("insert into user (id, name, age) values (#{user.id}, #{user.name}, #{user.age})")
    int insertSelective(@Param("user") User record);


    @Select("select * from user where id = #{id}")
    User selectByPrimaryKey(Integer id);

    @Update("update user set name = #{name} where id = #{id}")
    int updateByPrimaryKeySelective(User record);


    @Update("update user set name = #{user.name}, age = #{user.age} where id = #{user.id}")
    int updateByPrimaryKey(@Param("user") User record);
}