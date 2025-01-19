package com.example.ClinicaVeterinaria_Asuncion.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class PublicController {

    @GetMapping("/home")
    public String home(){
        return "Public Home";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Eres Administrador";
    }





}
