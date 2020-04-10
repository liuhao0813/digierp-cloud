package com.digierp.security.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuhao
 * @date 2020/4/10
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/create")
    public String createUser(@AuthenticationPrincipal String username) {
        return "create user: " + username;
    }

    @GetMapping("/single")
    public String getUserInfo(@AuthenticationPrincipal String username){
        return "getUserInfo " + username;
    }
}
