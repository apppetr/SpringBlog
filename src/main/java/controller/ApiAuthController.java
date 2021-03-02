package controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
public class ApiAuthController {
    @GetMapping("/api/auth/check")
    public String authCheck(Model model) {
        return "index";
    }

    @GetMapping("/api/auth/captcha")
    public String authCaptcha(Model model) {
        return "index";
    }

    @PostMapping("/api/auth/register")
    public String authRegister(Model model) {
        return "index";
    }

    @PostMapping("/api/auth/login")
    public String authLogin(Model model) {
        return "index";
    }

    @GetMapping("/api/auth/logout")
    public String authLogout(Model model) {
        return "index";
    }
}
