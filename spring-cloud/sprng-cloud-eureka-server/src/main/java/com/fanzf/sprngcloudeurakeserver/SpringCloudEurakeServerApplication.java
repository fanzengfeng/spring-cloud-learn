package com.fanzf.sprngcloudeurakeserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author
 * @create 2019 09 30 10:20
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurakeServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurakeServerApplication.class, args);
    }

}
