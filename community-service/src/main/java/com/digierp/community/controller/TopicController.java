package com.digierp.community.controller;

import com.digierp.community.service.feign.UserServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuhao
 * @date 2020/4/10
 */
@RestController
@RequestMapping("/topic")
public class TopicController {

    @Autowired
    private UserServiceFeign userServiceFeign;

    @PostMapping("/create")
    public String createTopic(@AuthenticationPrincipal  String username) {
        String userInfo = userServiceFeign.getUserInfo();
        return "create topic :" + username + ", Feign result：" + userInfo;
    }
}
