package org.javatop.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.javatop.mybatis.domain.User;
import org.springframework.stereotype.Repository;

/**
 * @author : Leo
 * @date  2024-03-03 21:58
 * @version 1.0
 * @description :
 */

@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}