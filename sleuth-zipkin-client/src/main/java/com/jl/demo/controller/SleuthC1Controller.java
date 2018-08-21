package com.jl.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/c1")
public class SleuthC1Controller {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/client2")
    public String callClient2(){
       return restTemplate.getForObject("http://localhost:4032/c2/client22", String.class);
    }

    @RequestMapping(value = "/client1")
    public String info(){
        return "client1";
    }


}
