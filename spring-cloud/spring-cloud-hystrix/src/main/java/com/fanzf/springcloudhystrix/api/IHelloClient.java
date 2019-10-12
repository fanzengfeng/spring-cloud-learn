package com.fanzf.springcloudhystrix.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author
 * @create 2019 10 09 11:52
 */
@FeignClient(name="spring-cloud-eureka-client", /*fallback=HelloClientFailImpl.class,*/ fallbackFactory = HelloClientFallbackFactory.class)
public interface IHelloClient {
    /**
     * 定义接口
     * @param name
     * @return
     */
    @RequestMapping(value="/hello")
    public String hello(@RequestParam("name") String name);
}
