package com.example.sample.test2.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @GetMapping
    @ResponseBody
    public String index() {
        return "<h1>HelloWorld!2</h1>";
    }
}