package com.digierp.gateway.config;

import com.digierp.gateway.component.PermissionAuthorizationManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

/**
 * @author liuhao
 * @date 2020/4/10
 */
@EnableWebFluxSecurity
public class GateWayWebSecurityConfig {

    @Autowired
    private PermissionAuthorizationManager permissionAuthorizationManager;

    @Bean
    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
        http.authorizeExchange()
                .pathMatchers("/auth/**").permitAll()
                .anyExchange().access(permissionAuthorizationManager);

        http.oauth2ResourceServer().jwt();
        http.csrf().disable();
        return http.build();
    }

}
