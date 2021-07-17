package com.pickUpCar.pickUpCar.controllers;

import com.pickUpCar.pickUpCar.entity.User;
import com.pickUpCar.pickUpCar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("listUsers", userService.getAllUsers());
        return "index";
    }

    @GetMapping("/user/list")
    public String showUsersList(Model model) {
        model.addAttribute("listUsers", userService.getAllUsers());
        return "user_list";
    }

    @GetMapping("/user/new")
    public String showNewUserForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "user_new";
    }

    @GetMapping("/user/update/{id}")
    public String showUpdateUserForm(@PathVariable (value = "id") long id, Model model){
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "user_update";
    }

    @GetMapping("/user/delete/{id}")
    public String deleteUser(@PathVariable (value = "id") long id){
        this.userService.deleteUserById(id);
        return "redirect:/user/list";
    }

    @PostMapping("/user/save")
    public String saveUser(@ModelAttribute("user") User user){
        userService.saveUser(user);
        return "redirect:/user/list";
    }


//    @GetMapping("/login")
//    public String getLoginPage() {
//        return "user-login";
//    }
//
//    @GetMapping("/register")
//    public String showSignUpForm(User user) {
//        return "user-register";
//    }
//
//    @PostMapping("/register")
//    public String addUser(@Valid User user, BindingResult result, Model model) {
//
//        if (result.hasErrors()) {
//            return "user-register";
//        }
//
//        userService.register(user);
//        model.addAttribute("users", userRepository.findAll());
//        return "redirect:/login";
//    }
//
//    @GetMapping("users/edit/{id}")
//    @Secured("ROLE_ADMIN")
//    public String showUsersList(@PathVariable("id") long id, Model model) {
//        User user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
//        UserDto userDto = userMapper.map(user);
//        model.addAttribute("userDto", userDto);
//        return "user-edit";
//    }
//
//    @PostMapping("users/update/{id}")
//    @Secured("ROLE_ADMIN")
//    public String updateUser(@PathVariable("id") long id, User user, BindingResult result, Model model) {
//        if (result.hasErrors()) {
//            user.setId(id);
//            return "user-edit";
//        }
//
//
//        userRepository.save(userMapper.map(user));
//        model.addAttribute("users", userRepository.findAll());
//        return "users";
//    }
//
//    @GetMapping("users/delete/{id}")
//    @Secured("ROLE_ADMIN")
//    public String deleteUser(@PathVariable("id") long id, Model model) {
//        User user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
//        userRepository.delete(user);
//        model.addAttribute("users", userRepository.findAll());
//        return "users";
//    }
}