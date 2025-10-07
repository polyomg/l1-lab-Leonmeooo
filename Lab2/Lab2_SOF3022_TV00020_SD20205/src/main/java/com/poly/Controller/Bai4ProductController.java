package com.poly.Controller;

import com.poly.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/bai4/product")
public class Bai4ProductController {

    // GET form
    @GetMapping("/form")
    public String form(Model model) {
        // sản phẩm mặc định
        Product p = new Product("iPhone 30", 5000.0);
        model.addAttribute("p1", p);

        // thêm sẵn 1 object rỗng cho p2 để tránh null
        model.addAttribute("p2", new Product());

        // danh sách sản phẩm mẫu
        model.addAttribute("items", getItems());

        return "bai4form";
    }

    // POST save
    @PostMapping("/save")
    public String save(@ModelAttribute("p2") Product p, Model model) {
        model.addAttribute("p1", new Product("iPhone 30", 5000.0));
        model.addAttribute("p2", p);
        model.addAttribute("items", getItems());
        return "bai4form";
    }

    // Danh sách sản phẩm
    @ModelAttribute("items")
    public List<Product> getItems() {
        return Arrays.asList(
                new Product("A", 1.0),
                new Product("B", 12.0),
                new Product("C", 25.5)
        );
    }
}
