package controller;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class ApiPostController {
    @GetMapping("/api/settings")
    public String apiSettinggs(Model model) {
        return "index";
    }

    @PostMapping("/api/post/like")
    @GetMapping("/api/settings")
    public String apiPostLike(Model model) {
        return "index";
    }

    @PostMapping("/api/post/dislike")
    @GetMapping("/api/settings")
    public String apipostDislike(Model model) {
        return "index";
    }
}
