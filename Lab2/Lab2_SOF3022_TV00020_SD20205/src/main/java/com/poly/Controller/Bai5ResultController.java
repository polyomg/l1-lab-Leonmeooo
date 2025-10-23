package com.poly.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/bai5")
public class Bai5ResultController {

    @RequestMapping("/a")
    public String m1() {
        return "bai5a";
    }

    @RequestMapping("/b")
    public String m2(Model model) {
        model.addAttribute("message", "I come from b");
        return "bai5a"; // ?1
    }

    @RequestMapping("/c")
    public String m3(RedirectAttributes params) {
        params.addAttribute("message", "I come from c");
        return "redirect:/bai5/a"; // ?2
    }

    @ResponseBody // ?3
    @RequestMapping("/d")
    public String m4() {
        return "I come from d";
    }
}
