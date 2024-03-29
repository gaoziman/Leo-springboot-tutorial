package org.javatop.knife4j.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.javatop.knife4j.domain.User;
import org.javatop.knife4j.mapper.UserMapper;
import org.javatop.knife4j.service.UserService;
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
