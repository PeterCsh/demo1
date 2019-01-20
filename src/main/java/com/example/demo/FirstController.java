package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class FirstController {
    @RequestMapping("/hello")
    public String test01(){
        return "hello";
    }

}
