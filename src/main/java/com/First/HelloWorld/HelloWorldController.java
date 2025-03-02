package com.First.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")  // Maps to GET /hello endpoint
    public String sayHello() {
        return "Hello from BridgeLabz";  // Returns the string as the response
    }
}
