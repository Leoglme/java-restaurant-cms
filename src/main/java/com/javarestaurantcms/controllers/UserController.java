package com.javarestaurantcms.controllers;

import com.javarestaurantcms.data.UserDAO;
import com.javarestaurantcms.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    private UserDAO userDAO;

    @PostMapping("/users")
    public String createUser(@ModelAttribute User newUser) {
        User user = new User(newUser.getName(), newUser.getEmail());
        userDAO.save(user);
        return "redirect:users";
    }

    @GetMapping
    public String showUser(Model model) {
        model.addAttribute("users", userDAO.findAll());
        model.addAttribute("newUser", new User());

        return "example";
    }
}
