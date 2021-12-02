package com.training.server.system.controller;

import com.alicp.jetcache.anno.CacheType;
import com.alicp.jetcache.anno.Cached;
import com.training.server.system.dto.AuthUserDto;
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

    @RequestMapping("/b")
    @ResponseBody
    @Cached(name="test-", key="'test'", cacheType = CacheType.BOTH, localExpire = 30, expire = 60)
    public String get() {
        System.out.println("hello");
        return "hello";
    }

    @RequestMapping("/c")
    @ResponseBody
    public String auth(AuthUserDto authUserDto) {
        System.out.println(authUserDto);
        return "ok";

    }


}
