package com.kubecondemo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/", produces = "text/html")
    public String index() {
        return "<html style='height: 100%; display: flex; justify-content: center; align-items: center; background-color: #0055A4;'>" +
               "<h1 style='font-size: 5rem; color: white; font-family: sans-serif; text-align: center;'>" +
               "Hello From KubeCon 2026!<br><span style='font-size: 2rem;'>Version 0.2</span>" +
               "</h1>" +
               "</html>";
    }
}
