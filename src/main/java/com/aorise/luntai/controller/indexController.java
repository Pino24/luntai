package com.aorise.luntai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author:Huangdong
 * @Desicription:
 * @Date:Created in 2019/11/13.
 * @Modified By:
 */
@Controller
public class indexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }


}
