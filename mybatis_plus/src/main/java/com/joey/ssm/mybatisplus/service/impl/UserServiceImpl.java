package com.joey.ssm.mybatisplus.service.impl;

import com.joey.ssm.mybatisplus.model.User;
import com.joey.ssm.mybatisplus.dao.UserDao;
import com.joey.ssm.mybatisplus.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author joey123
 * @since 2018-03-22
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

}
