package com.fanzf.springcloudhystrix;



import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author
 * @create 2019 10 09 10:22
 */
@SpringBootApplication
@EnableHystrix
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrixDashboard
@Slf4j
public class HystrixApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(HystrixApplication.class, args);
       log.info("sprign-cloud-hystrix启动!");
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplat() {
        return new RestTemplate();
    }
}
