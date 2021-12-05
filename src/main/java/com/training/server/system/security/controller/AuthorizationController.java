package com.training.server.system.security.controller;

import com.training.server.system.security.dto.LoginUserDto;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/auth")
public class AuthorizationController {

    @RequestMapping("/login")
    public String login(@RequestBody @Valid LoginUserDto loginUserDto) {
        System.out.println(loginUserDto.getUsername());
        System.out.println(loginUserDto.getPassword());
        return "";

    }

    @RequestMapping("/logout")
    public String logout() {

        return "";

    }

}
