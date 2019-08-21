//this is a place where crud operations are performed
//these are the rest API's
package com.example.employee.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController{
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}