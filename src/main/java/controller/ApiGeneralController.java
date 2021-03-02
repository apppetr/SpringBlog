package controller;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class ApiGeneralController {
    @GetMapping("/api/init")
    public String apiInit(Model model) {
        return "index";
    }

    @GetMapping("/api/settings")
    public String apiSettingsk(Model model) {
        return "index";
    }

    @GetMapping("/api/tag")
    public String apiTag(Model model) {
        return "index";
    }


    @GetMapping("/api/calendar")
    public String apiCalendar(Model model) {
        return "index";
    }

    @GetMapping("/api/statistics/my")
    public String apiStatistics(Model model) {
        return "index";
    }

    @GetMapping("/api/statistics/all")
    public String apiStatisticsAll(Model model) {
        return "index";
    }
}
