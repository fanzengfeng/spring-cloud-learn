package com.fanzf.springcloudhystrixturbine;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author
 * @create 2019 10 09 15:44
 */
@SpringBootApplication
@EnableTurbine
@EnableDiscoveryClient
@Slf4j
public class TurbineApplication {
    public static void main(String[] args) {
        SpringApplication.run(TurbineApplication.class, args);
        log.info("spring-cloud-hystrix-turbine启动!");
    }
}
