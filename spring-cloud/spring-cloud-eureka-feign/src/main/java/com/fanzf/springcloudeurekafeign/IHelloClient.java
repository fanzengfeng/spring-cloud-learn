package com.fanzf.springcloudeurekafeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author
 * @create 2019 09 30 15:43
 */
@FeignClient(name="spring-cloud-eureka-client")
public interface IHelloClient {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(@RequestParam("name") String name);

}
