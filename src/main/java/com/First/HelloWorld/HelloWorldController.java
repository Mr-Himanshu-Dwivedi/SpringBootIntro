package com.First.HelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping ("/")
    public String sayHello() {
        return "Hello from BridgeLabz (using Rest)"; // Returns the message
    }
}
