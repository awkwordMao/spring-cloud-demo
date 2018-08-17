package com.jl.demo.controller;

import com.jl.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/c")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    public String Hello(@PathVariable String name){
        return helloService.helloFromA(name);
    }

}
