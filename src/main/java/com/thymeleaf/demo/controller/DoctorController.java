package com.thymeleaf.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DoctorController {

    @GetMapping("/doctor")
    public String doctor(Model model, @RequestParam (value = "name", defaultValue = "Isma Dr.House") String name, @RequestParam(value = "number", defaultValue = "1") String number) {

        model.addAttribute("name", name);
        model.addAttribute("number", number);

        return "doctor";
    }
}