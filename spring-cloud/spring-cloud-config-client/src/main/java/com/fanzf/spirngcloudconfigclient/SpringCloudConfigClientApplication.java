package com.fanzf.spirngcloudconfigclient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author
 * @create 2019 10 12 16:36
 */
@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class SpringCloudConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigClientApplication.class,args);
        log.info("spring-cloud-config-client启动!");
    }
}
