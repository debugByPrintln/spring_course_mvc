package com.melnikov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class MainController {
    @RequestMapping("/")
    public String showMainPage(){
        return "main-page-view";
    }
}
