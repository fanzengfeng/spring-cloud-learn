package com.fanzf.spirngcloudeurekaclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 * @create 2019 09 30 14:14
 */
@RestController
public class DemoController {
    @GetMapping("/hello")
    public String hello(String name)
    {
        return name+"eureka 第一台服务器";
    }
}
