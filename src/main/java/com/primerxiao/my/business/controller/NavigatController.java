package com.primerxiao.my.business.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/backstage")
public class NavigatController {

    @GetMapping("/navigat")
    public String toNavigat() {

        return "backstage/navigat";
    }

}
