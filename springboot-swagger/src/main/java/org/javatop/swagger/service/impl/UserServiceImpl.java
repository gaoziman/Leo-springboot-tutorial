package org.javatop.swagger.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.javatop.swagger.domain.User;
import org.javatop.swagger.mapper.UserMapper;
import org.javatop.swagger.service.UserService;
import org.springframework.stereotype.Service;
/**
 * @author : Leo
 * @date  2024-03-23 21:07
 * @version 1.0
 * @description :
 */

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{

}
