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
        int i = userMapper.findUserByName(user.getUname());
        if(i>0){
            System.out.println("当前昵称已经注册过了");
        }else{
           User user1=new User();
           user1.setUname(user.getUname());
           user1.setUaccount(user.getUaccount());
           user1.setUpassword(user.getUpassword());
           user1.setUrole(user.getUrole());
           user1.setAddress(user.getAddress());
           user1.setTelephone(user.getTelephone());
           user1.setRealname(user.getRealname());
           user1.setRole_id(user.getRole_id());
           userMapper.regist(user1);
        }
        return  BaseResult.success();
    }

    public BaseResult login(String account,String password,int urole){
        User user= (User) userMapper.login(account,password,urole);
        if(user!=null){
            System.out.println("success");

        }else{
            System.out.println("fail");
        }
         return BaseResult.success();
    }
}
