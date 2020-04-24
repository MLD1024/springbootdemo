package com.lz.controller;

import com.lz.service.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈〉
 *
 * @author LZ
 * @create 2020/4/24
 * @since 1.0.0
 */
@RestController
public class HelloController {

    @Autowired
    private User user;

    @GetMapping("/get/info")
    public User hello() {
        return user;
    }
}
