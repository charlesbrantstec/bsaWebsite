package com.bsa.bsaWebsite.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SandboxController {
    @GetMapping("/sandbox")
    public String sandbox(){
        return "sandbox/sandbox";
    }

    @GetMapping("/vsandbox")
    public String vsandbox(){
        return "sandbox/vanillasandbox";
    }
}
