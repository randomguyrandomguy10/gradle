package com.example.demo;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
        @GetMapping("/")
        public String hello() {
            return "Bye";
        }
}
