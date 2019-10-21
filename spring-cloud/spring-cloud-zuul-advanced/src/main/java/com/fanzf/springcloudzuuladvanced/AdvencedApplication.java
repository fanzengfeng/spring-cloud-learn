package com.fanzf.springcloudzuuladvanced;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @author
 * @create 2019 10 15 17:47
 */
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@Slf4j
public class AdvencedApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdvencedApplication.class,args);
    }

    @Bean
    public AccessZuulFilter accessZuulFilter() {
        return new AccessZuulFilter();
    }
}
