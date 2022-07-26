package com.javarestaurantcms.controllers;

import com.javarestaurantcms.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    private final List<User> userList = new ArrayList<>();

    @GetMapping("/users")
    public String showGreeting(Model model) {
        User user1 = new User("tpto", "rri@eeec.com");
        User user2 = new User("machin", "machin@eeec.com");
        userList.add(user1);
        userList.add(user2);

        model.addAttribute("users", userList);

        return "users";
    }

}
