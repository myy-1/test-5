package com.ma.supermarket.mapper;

import com.ma.supermarket.bean.Product;
import com.ma.supermarket.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProductMapper {
    /**
     * 查询商品的库存量
     * @param id
     * @return
     */
    int selectCount(@Param("id") String id);

    /**
     * 更新表里的记录
     * @param remain
     * @return
     */
   int updateOne(@Param("id") String id,@Param("remain") int remain);

    /**
     * 库存为0，就下架该商品
     * @param id
     * @return
     */
   int deleteOne(@Param("id") String id);



}