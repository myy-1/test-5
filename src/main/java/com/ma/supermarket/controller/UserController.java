package com.ma.supermarket.controller;

import com.ma.supermarket.bean.BaseResult;
import com.ma.supermarket.bean.User;
import com.ma.supermarket.mapper.UserMapper;
import com.ma.supermarket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: 马月月
 * @Date: 2021/1/5 13:42
 * @Description:
 */
@RestController
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("/regist")
    @ResponseBody
    public BaseResult regist(@RequestParam("name") String username, @RequestParam("role") String role, @RequestParam("password") String password, @RequestParam("address") String address, @RequestParam("telephone") String telephone, @RequestParam("realname") String realname){
        return userService.regist(username, role, password, address, telephone, realname);

    }
    @RequestMapping("/login")
    @ResponseBody
    public BaseResult login(String name,String password){
        return userService.login(name,password);


    }
}
