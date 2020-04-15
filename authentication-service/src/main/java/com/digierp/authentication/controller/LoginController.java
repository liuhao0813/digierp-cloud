package com.digierp.authentication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author liuhao
 * @date 2020/4/12
 */
@Controller
@RequestMapping("login")
public class LoginController {

    @GetMapping("/page")
    public String login(){
        return "login";
    }

    @GetMapping("/user")
    @ResponseBody
    public String loginUser(){
        return "hello ";

    }


}
