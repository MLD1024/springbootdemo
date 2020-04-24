package com.lz.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * 〈〉
 *
 * @author LZ
 * @create 2020/4/24
 * @since 1.0.0
 */
@RefreshScope
public class User {
    @Value("${user.name}")
    private String name;
    @Value("${user.age}")
    private int age;
}
