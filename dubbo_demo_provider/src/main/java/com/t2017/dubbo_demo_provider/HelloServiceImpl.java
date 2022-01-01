package com.t2017.dubbo_demo_provider;


import com.t2017.dubbo_demo_api.HelloInterface;
import org.apache.dubbo.config.annotation.Service;


@Service(version = "1.0.0", interfaceClass = HelloInterface.class)
public class HelloServiceImpl implements HelloInterface {
    @Override
    public String sayHello(String name) {
        return "hello, " + name;
    }
}
