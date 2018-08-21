package com.jl.demo.controller;

import com.jl.demo.service.SleuthC2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/c2")
public class SleuthC2Controller {

    @Autowired
    SleuthC2Service service;

    @RequestMapping(value = "/client21")
    public String callC1(){
        return service.callFromC1();
    }

    @RequestMapping(value = "/client22")
    public String info(){
        return "client2";
    }
}
