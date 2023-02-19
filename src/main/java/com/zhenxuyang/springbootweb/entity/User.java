package com.zhenxuyang.springbootweb.entity;

import lombok.Data;

/**
 * @author: zhenxuyang
 * @data: 2023/2/19
 * @time: 23:23
 * @description:
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
