package com.digierp.authentication.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author liuhao
 * @date 2020/4/16
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "digierp.authentication")
public class AuthenticationProperties {

    /**
     * 直接配置对应的html文件名即可,不需要文件类型，如果是多级目录，需要带上目录信息
     */
    private String loginPage = "login";

}
