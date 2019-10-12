package com.fanzf.spirngcloudconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 * @create 2019 10 12 16:42
 */
@RestController
@RefreshScope
public class DemoController {
    @Value("${config}")
    String config;


    @GetMapping("/config")
    public String config() {
        return "返回的config参数值为:" + config;
    }
}
