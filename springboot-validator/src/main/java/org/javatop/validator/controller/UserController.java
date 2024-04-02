package org.javatop.validator.controller;

import lombok.extern.slf4j.Slf4j;
import org.javatop.validator.domain.User;
import org.javatop.validator.domain.UserDto;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

/**
 * (user)表控制层
 *
 * @author Leo
 */
@Validated
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {


    /**
     * 根据id查询用户信息
     * @param id  id
     * @return 注意：如果想在参数中使用 @NotNull 这种注解校验，就必须在类上添加 @Validated
     */
    @GetMapping("/getUser")
    public UserDto getUser(@NotNull(message = "用户id不能为空") Integer id){
        log.info("id: {}", id);
        UserDto userDto = new UserDto();
        userDto.setName("程序员Leo");
        userDto.setAge(18);
        userDto.setEmail("Leo@qq.com");
        return userDto;
    }

    /**
     * 添加用户
     * @param userDto  用户DTO
     * @return 注意：如果想在参数中使用 @NotNull 这种注解校验，就必须在类上添加 @Validated
     */
    @PostMapping("/saveUser")
    public String getUser(@Validated @RequestBody UserDto userDto){
        userDto.setId(100);
        return "ok";
    }


    /**
     * 添加用户
     * @param userDto 用户DTO
     * @return 注意：如果方法中的参数是对象类型，则必须要在参数对象前面添加 @Validated   进行分组校验，年龄满足大于17
     */
    @PostMapping("/saveUserGroup")
    public String saveUserGroup(@Validated(value = {UserDto.Default.class}) @RequestBody UserDto userDto){
        userDto.setId(100);
        return "ok";
    }


    @PostMapping("/saveUserWithCat")
    public String saveUserWithJob(@Validated @RequestBody UserDto userDto){
        userDto.setId(100);
        return "ok";
    }
}
