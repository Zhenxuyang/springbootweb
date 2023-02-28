package com.zhenxuyang.springbootweb.service.impl;

import com.zhenxuyang.springbootweb.entity.User;
import com.zhenxuyang.springbootweb.mapper.UserMapper;
import com.zhenxuyang.springbootweb.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhenxuyang
 * @since 2023-02-28
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
