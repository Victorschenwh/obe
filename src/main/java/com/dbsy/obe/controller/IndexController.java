package com.dbsy.obe.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("/{path}")
    public String index(@PathVariable("path") String path, Model model) {
        model.addAttribute("path", path);
        return "index";
    }

}
