package com.bridgelab.springsts;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller  // Combines both UC1 (REST API) and UC2 (Web Page)
@RequestMapping("/api")
public class SpringController {

    //  UC1: REST API - Returns plain text response
    @GetMapping("/hello")
    @ResponseBody  // Ensures this method returns raw text instead of a view
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    //  UC2: MVC with Thymeleaf - Returns a web page
    @GetMapping("/web-hello")
    public String displayMessage(Model model) {
        model.addAttribute("message", "Hello from BridgeLabz");
        return "hello";  // Maps to hello.html inside templates/
    }
}