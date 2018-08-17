package com.jl.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/a")
public class HelloController {

    @Value("${server.port}")
    private String port;

    //请求url：http://localhost:4011/a/hello?name=aaa
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(@RequestParam String name){
        return "hi, " + name + ".This is " + port;
    }

//    //请求url：http://localhost:4011/a/hello/aaa
//    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
//    public String hello(@PathVariable String name){
//        return "hi, " + name + ".This is " + port;
//    }
}
