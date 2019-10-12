package com.fanzf.springcloudeurekafeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 * @create 2019 09 30 15:46
 */
@RestController
public class RPCDemoController {
    @Autowired
    IHelloClient helloClient;
    @GetMapping("/prcHello")
    public String RPCHello(String name)
    {
        return  helloClient.hello(name);
    }
}
