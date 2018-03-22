package com.joey.ssm.web.controller;

import com.joey.ssm.test.facade.TestFacade;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by yp-tc-m-7179 on 2018/3/22.
 *
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
    @Resource
    private TestFacade testFacade;

    @GetMapping("/world")
    @ResponseBody
    public String world(){
        testFacade.test();
        return "world";
    }
}
