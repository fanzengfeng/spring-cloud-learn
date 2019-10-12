package com.fanzf.springcloudhystrix.api;

import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author
 * @create 2019 10 09 11:53
 */
@Component
@Slf4j
public class HelloClientFallbackFactory implements FallbackFactory<IHelloClient> {

    @Autowired
    @Qualifier("fallback")
    IHelloClient helloClient;

    @Override
    public IHelloClient create(Throwable throwable) {
        log.error("feign调用发生异常，触发fallback方法 ", throwable);
        return helloClient;
    }
}
