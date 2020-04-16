package com.digierp.authentication.controller;

import com.digierp.authentication.config.AuthenticationProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;


/**
 * @author liuhao
 * @date 2020/4/12
 */
@Controller
@RequestMapping("login")
@RequiredArgsConstructor
public class LoginController {

    @GetMapping("/user")
    @ResponseBody
    public String loginUser(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Object principal = authentication.getPrincipal();
        return "hello " + principal;

    }


}
