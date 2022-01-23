package com.ataew.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(@RequestParam("name") String name, @RequestParam("surname") String surname, Model model) {
        model.addAttribute("message", "Result =  " + name + " " + surname);
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodByePage() {
        return "first/goodbye";
    }

    @GetMapping("/cal")
    public String calculate(@RequestParam("a") int a, @RequestParam("b") int b,
                            @RequestParam("action") String action, Model model) {
        double result = 0.0;

        switch (action) {
            case "multiplication":
                result = Double.valueOf(a * b);
                break;
            case "addition":
                result = Double.valueOf(a + b);
                break;
            case "subtraction":
                result = Double.valueOf(a - b);
                break;
            case "division":
                result = Double.valueOf(a / b);
                break;
            default:
                result = 0;
                break;
        }
        model.addAttribute("result", result);
        return "first/calculator";
    }
}