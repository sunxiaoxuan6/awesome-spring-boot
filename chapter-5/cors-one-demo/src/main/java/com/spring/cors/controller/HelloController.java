package com.spring.cors.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : zhayh
 * @date : 2020-3-23 16:00
 * @description :
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello cors!";
    }
}
