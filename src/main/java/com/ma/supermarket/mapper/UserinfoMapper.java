package com.ma.supermarket.mapper;

import com.ma.supermarket.bean.Userinfo;


public interface UserinfoMapper {


    int insert(Userinfo record);

    int insertSelective(Userinfo record);

}