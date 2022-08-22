package com.javarestaurantcms.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConfigurationController {
    @GetMapping("/configuration")
    public String showConfiguration() {
        return "configuration";
    }
}
