package project.back.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/main")
    public String main() { return "index"; }

    @GetMapping("/test")
    public String test() { return "/file/index"; }

    @GetMapping("/a.html?company=현대차")
    public String chart() { return "/file/a"; }
}
