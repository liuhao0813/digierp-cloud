package com.digierp.auth.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * @author liuhao
 * @date 2020/4/10
 */
@Component
public class DigierpUserDetailsService implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return User.withUsername(username)
                .password(passwordEncoder.encode("123456"))
                .authorities(AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_ADMIN"))
                .build();
    }
}
