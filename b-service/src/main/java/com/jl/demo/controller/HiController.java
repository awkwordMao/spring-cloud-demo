package com.jl.demo.controller;

import com.jl.demo.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/b")
@RestController
public class HiController {

    @Autowired
    HiService hiService;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hi(@RequestParam String name){
        return hiService.hiService(name);
    }
}
