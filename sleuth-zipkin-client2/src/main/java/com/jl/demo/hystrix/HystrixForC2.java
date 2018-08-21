package com.jl.demo.hystrix;

import com.jl.demo.service.SleuthC2Service;
import org.springframework.stereotype.Component;

@Component
public class HystrixForC2 implements SleuthC2Service {
    @Override
    public String callFromC1() {
        return "null";
    }
}
