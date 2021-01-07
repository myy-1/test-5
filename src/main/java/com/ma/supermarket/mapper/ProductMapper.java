package com.ma.supermarket.mapper;


import com.ma.supermarket.bean.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProductMapper {

    /**
     * 根据名字取查询商品
     * @param name
     * @return
     */
    String selectByName(@Param("name") String name);

    /**
     * 展示查询到的商品相关信息
     * @param product
     * @return
     */
    List<Product> showResult(Product product);
    /**
     * 查询商品的库存量
     * @param id
     * @return
     */
    int selectCount(@Param("id") int id);

    /**
     * 更新表里的记录
     * @param remain
     * @return
     */
   List<Product> updateOne(@Param("id") String id,@Param("remain") int remain);

    /**
     * 库存为0，就下架该商品
     * @param id
     * @return
     */
   void deleteOne(@Param("id") String id);



}