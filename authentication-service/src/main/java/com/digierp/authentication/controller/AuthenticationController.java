package com.digierp.authentication.controller;

import com.digierp.authentication.config.AuthenticationProperties;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 认证控制器
 * @author liuhao
 * @date 2020/4/16
 */
@Slf4j
@RestController
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationProperties authenticationProperties;

    /**
     * 跳转到对应的登录页面，可以自定义，默认是login页面
     *
     * @return
     */
    @GetMapping("/authentication/require")
    public ModelAndView authenticationRequire() {
        String loginPage = authenticationProperties.getLoginPage();
        ModelAndView modelAndView = new ModelAndView(loginPage);
        log.info("配置的登录页为：{}", loginPage);
        return modelAndView;
    }

}
