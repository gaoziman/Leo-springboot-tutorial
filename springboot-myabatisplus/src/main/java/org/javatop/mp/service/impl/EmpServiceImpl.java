package org.javatop.mp.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.javatop.mp.mapper.EmpMapper;
import org.javatop.mp.domain.Emp;
import org.javatop.mp.service.EmpService;
/**
 * @author : Leo
 * @date  2024-03-23 20:55
 * @version 1.0
 * @description :
 */

@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp> implements EmpService{

}
