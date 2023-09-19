package ecommerce.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
 // @RequestMapping("/admin") original
@RequestMapping("/")
public class AdminController {

    @GetMapping
    public String home() {
        return "administrador/home";
    }
}
