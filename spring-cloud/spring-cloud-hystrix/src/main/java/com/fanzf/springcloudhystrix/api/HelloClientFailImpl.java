package com.fanzf.springcloudhystrix.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author
 * @create 2019 10 09 11:54
 */
@Component("fallback")
@Slf4j
public class HelloClientFailImpl  implements IHelloClient {
    @Override
    public String hello(String name) {
        log.error("restTemplate调用[hello]服务发生异常，参数name:{}", name);
        return "restTemplate调用[hello]服务发异常，参数name:" + name;
    }

}
