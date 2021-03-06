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

    /**
     * 注册
     * @param user
     * @return
     */
    @RequestMapping("/regist")
    /**
     * 将返回结果封装成json
     */
    @ResponseBody
    public BaseResult regist(User user){
        return userService.regist(user);
    }

    /**
     * 登录
     *
     * todo mayueyue 登录有报错
     * @param account
     * @param password
     * @param urole
     * @return
     */
    @RequestMapping("/login")
    @ResponseBody
    public BaseResult login(String account,String password,int urole){
        return userService.login(account,password,urole);
    }
}
