package com.fanzf.spirngcloudeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author
 * @create 2019 09 30 14:13
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudEurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaClientApplication.class, args);
    }
}
