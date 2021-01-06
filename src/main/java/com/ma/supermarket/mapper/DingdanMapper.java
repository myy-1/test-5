package com.ma.supermarket.mapper;

import com.ma.supermarket.bean.Dingdan;

public interface DingdanMapper {
    int insert(Dingdan record);

    int insertSelective(Dingdan record);
}