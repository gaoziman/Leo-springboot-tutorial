package org.javatop.jpa.service;

import org.javatop.jpa.domain.User;

import java.util.List;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-17 21:37
 * @description :
 */
public interface UserService {

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User findById(Integer id);

    /**
     * 查询所有用户
     * @return
     */
    List<User> findAllUsers();

    /**
     * 保存用户
     * @param user
     * @return
     */
    User addUser(User user);

    /**
     * 删除用户
     * @param id
     */
    void delete(Integer id);


     List<User> findByKeyName(String name);
}
