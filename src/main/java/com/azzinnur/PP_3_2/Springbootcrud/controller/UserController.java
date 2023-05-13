package com.azzinnur.PP_3_2.Springbootcrud.controller;


import com.azzinnur.PP_3_2.Springbootcrud.model.User;
import com.azzinnur.PP_3_2.Springbootcrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/")
    public String getAllUsers(Model model) {
        List<User> userList = userService.getAllUsers();
        model.addAttribute("users", userList);
        return "users";
    }

    @GetMapping(value = "/addNewUser")
    public String addNewUser(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "new_user";
    }

    @PutMapping(value = "/saveNewUser")
    public String saveNewUser(@ModelAttribute("user") User user) {
        userService.add(user);
        return "redirect:/";
    }


    @GetMapping(value = "/editUser/{id}")
    public String editUser(@PathVariable long id, Model model) {
        User user = userService.findUser(id);
        model.addAttribute("user", user);
        return "edit_user";
    }

    @GetMapping(value = "/deleteUser/{id}")
    public String deleteUser(@PathVariable long id) {
        userService.delete(id);
        return "redirect:/";
    }

    @PatchMapping(value = "/saveUser")
    public String saveUser(@ModelAttribute("user") User user) {
        userService.update(user);
        return "redirect:/";
    }

}
