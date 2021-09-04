package org.javajarvis.SistemCuti_UASJava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class HomeController {

    @RequestMapping("/{path:[a-z0-9]+}")
    String index() {
        return "forward:/index.html";
    }
}