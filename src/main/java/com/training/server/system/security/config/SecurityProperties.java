package com.training.server.system.security.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author andy
 * @date 2021/12/3
 */
//@Configuration
public class SecurityProperties {

    @Bean
    public JwtProperties jwtProperties() {
        return new JwtProperties();
    }

    @Bean
    public UrlProperties urlProperties() {
        return new UrlProperties();
    }

}
