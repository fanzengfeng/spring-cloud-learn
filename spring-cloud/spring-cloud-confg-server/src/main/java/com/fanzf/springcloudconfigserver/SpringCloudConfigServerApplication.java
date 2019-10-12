package com.fanzf.springcloudconfigserver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author
 * @create 2019 10 09 17:26
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
@Slf4j
public class SpringCloudConfigServerApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringCloudConfigServerApplication.class, args);
        log.info("spring-cloud-config-server启动!");
    }
}
