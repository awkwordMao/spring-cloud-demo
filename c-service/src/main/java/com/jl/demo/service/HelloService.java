package com.jl.demo.service;

import com.jl.demo.hystrix.HelloHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "a-service", fallback = HelloHystrix.class)
public interface HelloService {

    @RequestMapping(value = "/a/hello", method = RequestMethod.GET)
    String helloFromA();
}
