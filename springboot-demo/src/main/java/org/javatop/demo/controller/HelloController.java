package org.javatop.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-12-22 11:52
 * @description :
 */
@RestController
@RequestMapping
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World!!!";
    }
}

