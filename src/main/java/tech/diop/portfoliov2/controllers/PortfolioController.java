package tech.diop.portfoliov2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {

    @GetMapping({"/", "/home"})
    public String home() {
      return "home";
    }
}
