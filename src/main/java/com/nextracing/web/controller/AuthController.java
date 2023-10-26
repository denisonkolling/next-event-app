package com.nextracing.web.controller;

import com.nextracing.web.dto.RegistrationDto;
import com.nextracing.web.service.UserService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {

    private UserService userService;


    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String getRegisterForm(Model model) {
        RegistrationDto user = new RegistrationDto();
        model.addAttribute("user", user);
        return "register";
    }

    @PostMapping("/register")
    public String saveUser(@Valid @ModelAttribute("user") RegistrationDto registrationDto, BindingResult result,  Model model){
        if(result.hasErrors()){
            model.addAttribute("user", registrationDto);
            return "register";
        }
        userService.saveUser(registrationDto);
        return "redirect:/clubs";
    }

}
