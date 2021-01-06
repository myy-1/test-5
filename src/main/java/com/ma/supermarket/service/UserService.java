package com.ma.supermarket.service;

import com.ma.supermarket.bean.BaseResult;
import com.ma.supermarket.bean.User;
import com.ma.supermarket.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: 马月月
 * @Date: 2021/1/5 13:18
 * @Description:
 */
@Service
public class UserService {

    @Resource
    UserMapper userMapper;

    public BaseResult regist(String name, String role, String password, String address, String telephone, String realname){
        int i = userMapper.findUserByName(name);
        if(i>0){
            System.out.println("当前昵称已经注册过了");
        }else{
            User user=new User();
            user.setUsername(name);
            user.setUrole(role);
            user.setPassword(password);
            user.setAddress(address);
            user.setTelephone(telephone);
            user.setRealname(realname);
            userMapper.insertOne(user);
        }
        return  BaseResult.success();
    }

    public BaseResult login(String name,String password){
        User user= (User) userMapper.login(name,password);
        if(user!=null){
            System.out.println("success");

        }else{
            System.out.println("fail");
        }
         return BaseResult.success();
    }
}
