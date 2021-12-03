package com.training.server.system.security.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * @author andy
 * @date 2021/12/3
 */
@ConfigurationProperties(prefix = "security.url")
public class UrlProperties {

    private String[] ignoredUrl;

    public String[] getIgnoredUrl() {
        return ignoredUrl;
    }

    public void setIgnoredUrl(String[] ignoredUrl) {
        this.ignoredUrl = ignoredUrl;
    }
}
