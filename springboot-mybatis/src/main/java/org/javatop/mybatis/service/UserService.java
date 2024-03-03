package org.javatop.mybatis.service;

import org.javatop.mybatis.mapper.UserMapper;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import org.javatop.mybatis.domain.User;
/**
 * @author : Leo
 * @date  2024-03-03 21:58
 * @version 1.0
 * @description : 业务层
 */

@Service
public class UserService{

    @Autowired
    private UserMapper userMapper;


    
    public int deleteByPrimaryKey(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(User record) {
        return userMapper.insert(record);
    }

    
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

}
