package com.training.server.system.security.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author andy
 * @date 2021/12/3
 */
@ConfigurationProperties(prefix = "security.jwt")
public class JwtProperties {

    private String tokenHeader;

    private String tokenHead;

    private String base64Key;

    private Long expiration;

    public String getTokenHeader() {
        return tokenHeader;
    }

    public void setTokenHeader(String tokenHeader) {
        this.tokenHeader = tokenHeader;
    }

    public String getTokenHead() {
        return tokenHead;
    }

    public void setTokenHead(String tokenHead) {
        this.tokenHead = tokenHead;
    }

    public String getBase64Key() {
        return base64Key;
    }

    public void setBase64Key(String base64Key) {
        this.base64Key = base64Key;
    }

    public Long getExpiration() {
        return expiration;
    }

    public void setExpiration(Long expiration) {
        this.expiration = expiration;
    }
}
