package com.ma.supermarket.mapper;

import com.ma.supermarket.bean.Menu;



public interface MenuMapper {


    int insert(Menu record);

    int insertSelective(Menu record);

}