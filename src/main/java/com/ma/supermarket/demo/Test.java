package com.ma.supermarket.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: 马月月
 * @Date: 2021/1/4 21:36
 * @Description:
 */
@Controller
@RequestMapping("testBean")
public class Test {
    @RequestMapping("testdemo")
    public String TestDemo(){
        return "index";
    }
}
