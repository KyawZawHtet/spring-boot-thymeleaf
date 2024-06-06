/**
 * @Author : Kyaw Zaw Htet
 * @Date : 6/6/2024
 * @Time : 11:54 AM
 * @Project_Name : spring-boot-thymeleaf
 */
package com.kyaw.springbootthymeleaf.controller;

import com.kyaw.springbootthymeleaf.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    // handler method to handle variable-expression
    // http://localhost:8080/variable-expression
    @GetMapping("/variable-expression")
    public String variableExpression(Model model){
        User user = new User("Kyaw", "kyaw@gmail.com", "ADMIN", "Male");
        model.addAttribute("user",user);
        return "variable-expression";
    }

    // handler method to handle selection-expression
    // http://localhost:8080/selection-expression
    @GetMapping("/selection-expression")
    public String selectionExpression(Model model){
        User user = new User("Kyaw", "kyaw@gmail.com", "ADMIN", "Male");
        model.addAttribute("user",user);
        return "selection-expression";
    }

    // handler method to handle message-expression
    // http://localhost:8080/message-expression
    @GetMapping("/message-expression")
    public String messageExpression(){
        return "message-expression";
    }

    // handler method to handle link-expression
    // http://localhost:8080/link-expression
    @GetMapping("/link-expression")
    public String linkExpression(Model model){
        model.addAttribute("id",1);
        return "link-expression";
    }

    // handler method to handle fragment-expression
    // http://localhost:8080/link-expression
    @GetMapping("/fragment-expression")
    public String fragmentExpression(){
        return "fragment-expression";
    }
}
