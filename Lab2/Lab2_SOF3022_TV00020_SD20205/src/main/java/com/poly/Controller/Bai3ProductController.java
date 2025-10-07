package com.poly.Controller;

import com.poly.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/bai3/product")
public class Bai3ProductController {

    // GET form
    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("p", new Product()); // tránh null
        return "bai3form";
    }

    // POST save
    @PostMapping("/save")
    public String save(@ModelAttribute("p") Product p, Model model) {
        model.addAttribute("p", p);
        return "bai3form";
    }
}
