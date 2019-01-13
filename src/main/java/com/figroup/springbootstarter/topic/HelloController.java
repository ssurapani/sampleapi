package com.figroup.springbootstarter.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/topic")
    public String sayHai(){
        return "Hai There.";
    }

}
