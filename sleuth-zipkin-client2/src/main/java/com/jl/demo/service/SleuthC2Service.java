package com.jl.demo.service;

import com.jl.demo.hystrix.HystrixForC2;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "sleuth-client1", fallback = HystrixForC2.class)
public interface SleuthC2Service {

    @RequestMapping(value = "/c1/client1", method = RequestMethod.GET)
    String callFromC1();
}
