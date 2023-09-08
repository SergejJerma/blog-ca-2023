//package com.serjer.blogca2023.controller;
//
//import com.serjer.blogca2023.entity.User;
//import jakarta.validation.Valid;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//@RequestMapping("/users")
//public class UserController {
//
//    @GetMapping("/add")
//    public String showAddUserForm(User user) {
//        return "user/addUser";
//    }
//
//    @PostMapping("/add")
//    public String addUser(@Valid User user, BindingResult result, Model model) {
//
//
//        if (result.hasErrors()) {
//            return "user/addUser";
//        }
//
//        return "redirect:/users/add";
//    }
//
//}
