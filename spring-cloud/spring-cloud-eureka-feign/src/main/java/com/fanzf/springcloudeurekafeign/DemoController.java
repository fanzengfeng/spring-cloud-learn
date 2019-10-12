package com.fanzf.springcloudeurekafeign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 * @create 2019 09 30 15:42
 */
@RestController
public class DemoController {
    @GetMapping("/hello")
    public String hello(String name)
    {
        return name+"eureka 第二台服务器";
    }
}
