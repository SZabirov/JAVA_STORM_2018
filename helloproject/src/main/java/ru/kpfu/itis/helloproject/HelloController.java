package ru.kpfu.itis.helloproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }
    
    @GetMapping("/greeting")
    String greet(@RequestParam String username, Model model) {
        model.addAttribute("username", username);
        return "greeting";
    }
}
