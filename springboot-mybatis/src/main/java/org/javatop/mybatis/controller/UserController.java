package org.javatop.mybatis.controller;

import org.javatop.mybatis.domain.User;
import org.javatop.mybatis.service.UserService;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * (user)表控制层
 *
 * @author Leo
 */
@RestController
@RequestMapping("/user")
public class UserController {
    /**
     * 服务对象
     */
    @Autowired
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public User selectOne(Integer id) {
        return userService.selectByPrimaryKey(id);
    }

}
