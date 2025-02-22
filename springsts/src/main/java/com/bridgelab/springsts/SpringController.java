package com.bridgelab.springsts;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SpringController {
    //UC1
    @GetMapping("/hello")
    public String sayHelloUC1() {
        return "Hello from BridgeLabz";
}
}