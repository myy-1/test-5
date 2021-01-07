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

    public BaseResult regist(User user){
        String i = userMapper.findUserByName(user.getUname());
        if(i==null){
            System.out.println("当前昵称已经注册过了");
        }else{
            User user=new User();
            user.setUname();
            user.setUaccount();
            user.setUrole();
            user.setPassword();
            user.setAddress();
            user.setTelephone();
            user.setRealname();
        }
        return  BaseResult.success();
    }

    public BaseResult login(String account,String password){
        User user= (User) userMapper.login(account,password);
        if(user!=null){
            System.out.println("success");

        }else{
            System.out.println("fail");
        }
         return BaseResult.success();
    }
}
