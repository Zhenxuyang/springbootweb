package com.zhenxuyang.springbootweb.service.impl;

import com.zhenxuyang.springbootweb.entity.Blog;
import com.zhenxuyang.springbootweb.mapper.BlogMapper;
import com.zhenxuyang.springbootweb.service.IBlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhenxuyang
 * @since 2023-02-27
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements IBlogService {

}
