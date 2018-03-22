package com.joey.ssm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yp-tc-m-7179 on 2018/3/22.
 *
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/world")
    @ResponseBody
    public String world(){
        return "world";
    }
}
