/**
 * @Author : Kyaw Zaw Htet
 * @Date : 6/6/2024
 * @Time : 11:23 AM
 * @Project_Name : spring-boot-thymeleaf
 */
package com.kyaw.springbootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    // handler method to handle /hello-world request
    // http://localhost:8080/hello-world
    @GetMapping("/hello-world")
    public String HelloWorld(Model model){
        model.addAttribute("message", "Hello World!");
        return "hello-world";
    }
}
