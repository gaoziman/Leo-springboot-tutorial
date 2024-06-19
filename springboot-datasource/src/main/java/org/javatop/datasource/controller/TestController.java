package org.javatop.datasource.controller;

import org.javatop.datasource.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-06-19 11:30
 * @description :
 */
@RestController
public class TestController {

    private  MyService myService;

    @Autowired
    public TestController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/test")
    public void execute() {
        myService.executeQuery();
    }
}

