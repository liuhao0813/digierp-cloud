package com.digierp.community.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author liuhao
 * @date 2020/4/10
 */
@FeignClient("security-service")
public interface UserServiceFeign {

    @GetMapping("/user/single")
    String getUserInfo();


}
