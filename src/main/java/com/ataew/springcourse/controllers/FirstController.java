package com.ataew.springcourse.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(@RequestParam("a") Integer a,
                            @RequestParam("b") Integer b,
                            @RequestParam("action") String action,
                            Model model) {
        Double result = new Double(0.0);
        System.out.println("A = " + a + "" + "\tB = " + b);

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
                break;
        }
        model.addAttribute("message", "Result =  " + String.valueOf(result));
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodByePage() {
        return "first/goodbye";
    }

    @GetMapping("/cal")
    public String calculate(@RequestParam("a") Integer a, @RequestParam("b") Integer b,
                            @RequestParam("action") String action, Model model) {
        double result = 0.0;
        System.out.println("A = " + a + "" + "\tB = " + b);

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
                break;
        }
        model.addAttribute("message", "Result =  " + String.valueOf(result));
        return "first/cal";
    }

}