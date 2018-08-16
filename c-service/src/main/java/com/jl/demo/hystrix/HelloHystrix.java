package com.jl.demo.hystrix;

import com.jl.demo.service.HelloService;
import org.springframework.stereotype.Component;

@Component
public class HelloHystrix implements HelloService {
    @Override
    public String helloFromA() {
        return "sorry!!!!!";
    }
}
