package org.javatop.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.javatop.swagger.domain.User;
import org.javatop.swagger.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (user)表控制层
 *
 * @author Leo
 */
@RestController
@Api(tags = "用户管理")
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;


    /**
     * 获取用户列表
     *
     * @return
     */
    @ApiOperation("查询所有用户")
    @GetMapping("/list")
    public List<User> getUserList() {
        return userService.list();
    }


    /**
     * 根据id获取用户信息
     *
     * @param id 用户id
     * @return 用户
     */
    @ApiOperation("根据id查询用户")
    @GetMapping("/{id}")
    public User getUser(@PathVariable Integer id) {
        return userService.getById(id);
    }


    /**
     * 新增用户信息
     *
     * @param user 用户
     * @return 新增结果
     */
    @ApiOperation("新增用户")
    @PostMapping("/save")
    public boolean saveUser(@RequestBody User user) {
        return userService.save(user);
    }


    /**
     * 修改用户信息
     *
     * @param user 用户
     * @return 修改结果
     */
    @ApiOperation("修改用户")
    @PutMapping("/update")
    public boolean updateUser(@RequestBody User user) {
        return userService.updateById(user);
    }


    /**
     * 删除用户信息
     *
     * @param id 用户id
     * @return 删除结果
     */
    @ApiOperation("删除用户")
    @DeleteMapping("/{id}")
    public boolean deleteUser(@PathVariable Integer id) {
        return userService.removeById(id);
    }

}
