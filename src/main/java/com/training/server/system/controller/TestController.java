package com.training.server.system.controller;

import com.alicp.jetcache.anno.CacheType;
import com.alicp.jetcache.anno.Cached;
import com.training.server.security.dto.LoginUserDto;
import com.training.server.system.converter.UserConverter;
import com.training.server.system.dto.UserDto;
import com.training.server.system.entity.User;
import com.training.server.system.service.MenuService;
import com.training.server.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author andy
 * @date 2021/11/29
 */

@Controller
@RequestMapping("/a")
public class TestController {

    @Autowired
    private MenuService menuService;
    @Autowired
    private UserService userService;

    @Autowired
    private UserConverter userConverter;

    @RequestMapping("/b")
    @ResponseBody
    @Cached(name="test-", key="'test'", cacheType = CacheType.BOTH, localExpire = 30, expire = 60)
    public String get() {

//        User u = new User();
//        u.setUsername("anme");
//        UserDto d = userConverter.toDto(u);

        userService.findById(1);
//        System.out.println(d);
        return "hello";
    }

    @RequestMapping("/c")
    @ResponseBody
    public String auth(LoginUserDto loginUserDto) {
        System.out.println(loginUserDto);
        return "ok";

    }





}
