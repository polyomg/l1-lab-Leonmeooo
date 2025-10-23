package com.poly.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/bai2")
public class Bai2ParamController {

    @GetMapping("/form")
    public String form() {
        return "bai2form";
    }

    @PostMapping("/save/{x}")
    public String save(@PathVariable("x") String x,
                       @RequestParam("y") String y,
                       Model model) {
        model.addAttribute("x", x);
        model.addAttribute("y", y);
        return "bai2form";
    }
}
