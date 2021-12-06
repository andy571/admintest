package com.training.server.security.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @author andy
 * @date 2021/12/6
 */
public class JwtUserDetailsService implements UserDetailsService {




    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {





        return null;
    }

}
