package com.bsa.bsaWebsite.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyDocsController {

    @GetMapping("/mydocs")
    public String myDocs(){
        return "mydocs";
    }
}
