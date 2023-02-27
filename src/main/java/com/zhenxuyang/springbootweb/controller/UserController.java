package com.zhenxuyang.springbootweb.controller;

import com.zhenxuyang.springbootweb.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhenxuyang
 * @since 2023-02-27
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService userService;
    @GetMapping("/{id}")
    public Object getById(@PathVariable("id") Long id){
        return userService.getById(id);
    }

}
