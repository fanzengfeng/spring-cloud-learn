package com.fanzf.springcloudhystrix;


import com.fanzf.springcloudhystrix.api.IHelloClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 * @create 2019 10 09 10:28
 */
@RestController
@Slf4j
public class PRCDemoController {
    @Autowired
    IHelloClient helloClient;


    @GetMapping("/prcHello")
    @HystrixCommand(fallbackMethod="fallback")
    public String RPCHello(String name)
    {
        return  helloClient.hello(name);
    }

    public String fallback(String name,Throwable throwable) {
        log.error("发生异常", throwable);
        log.warn("restTemplate调用服务发生异常，参数name:{}", name);
        return "restTemplate调用服务发生异常，参数name：" + name;
    }
}
