package org.javatop.jpa.service.impl;

import org.javatop.jpa.domain.User;
import org.javatop.jpa.repo.UserRepository;
import org.javatop.jpa.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-17 21:46
 * @description :
 */
@Service
public class UserServiceImpl  implements UserService {

    @Resource
    private UserRepository userRepository;


    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    @Override
    public User findById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }


    /**
     * 查询所有用户信息
     * @return
     */
    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }


    /**
     * 添加用户信息
     * @param user
     * @return
     */
    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }


    /**
     * 更新用户信息
     * @param id
     */
    @Override
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<User> findByKeyName(String name) {
        return userRepository.findByName(name);
    }
}
