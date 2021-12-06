package com.training.server.system.controller;

import com.alicp.jetcache.anno.CacheType;
import com.alicp.jetcache.anno.Cached;
import com.training.server.security.dto.LoginUserDto;
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

    @RequestMapping("/b")
    @ResponseBody
    @Cached(name="test-", key="'test'", cacheType = CacheType.BOTH, localExpire = 30, expire = 60)
    public String get() {

        userService.findById(1L);
        System.out.println("hello");
        return "hello";
    }

    @RequestMapping("/c")
    @ResponseBody
    public String auth(LoginUserDto loginUserDto) {
        System.out.println(loginUserDto);
        return "ok";

    }





}
