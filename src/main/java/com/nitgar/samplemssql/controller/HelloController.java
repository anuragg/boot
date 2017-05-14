package com.nitgar.samplemssql.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by avnitagupta on 13/05/17.
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "Greeting from spring boot";
    }
}
