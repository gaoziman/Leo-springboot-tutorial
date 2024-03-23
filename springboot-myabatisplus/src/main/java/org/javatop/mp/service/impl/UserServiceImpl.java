package org.javatop.mp.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.javatop.mp.mapper.UserMapper;
import org.javatop.mp.domain.User;
import org.javatop.mp.service.UserService;
/**
 * @author : Leo
 * @date  2024-03-23 21:07
 * @version 1.0
 * @description :
 */

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{

}
