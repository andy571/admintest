package com.training.server.security.dto;

import javax.validation.constraints.NotBlank;

/**
 * @author andy
 * @date 2021/12/2
 */
public class LoginUserDto {

    @NotBlank
    private String username;

    @NotBlank
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
