package com.training.server.security.controller;

import com.training.server.security.dto.LoginUserDto;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
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

//        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(authUser.getUsername(), password);
//        Authentication authentication = authenticationManagerBuilder.getObject().authenticate(authenticationToken);
//        SecurityContextHolder.getContext().setAuthentication(authentication);





        return "";

    }

    @RequestMapping("/logout")
    public String logout() {

        return "";

    }

}
