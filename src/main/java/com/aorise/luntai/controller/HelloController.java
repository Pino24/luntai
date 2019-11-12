package com.aorise.luntai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author:Huangdong
 * @Desicription:
 * @Date:Created in 2019/11/12.
 * @Modified By:
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
}
