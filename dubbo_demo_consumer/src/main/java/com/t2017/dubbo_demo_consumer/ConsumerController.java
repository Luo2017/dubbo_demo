package com.t2017.dubbo_demo_consumer;


import com.t2017.dubbo_demo_api.HelloInterface;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Reference(version = "1.0.0")
    HelloInterface helloInterface;

    @Reference(version = "1.0.1")
    HelloInterface hello2Interface;

    @GetMapping("/hello")
    public String sayHello() {
        return helloInterface.sayHello("this is dubbo demo!");
    }

    @GetMapping("/hello/1")
    public String sayHello2() {
        return hello2Interface.sayHello("this is dubbo demo!");
    }

}
