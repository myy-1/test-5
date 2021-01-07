package com.ma.supermarket.service;

import com.ma.supermarket.bean.Product;
import com.ma.supermarket.mapper.ProductMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: 马月月
 * @Date: 2021/1/7 10:03
 * @Description:
 */
@Service
public class ProductService {
    @Resource
    private ProductMapper productMapper;

    /**
     * 通过商品名进行查询，并进行相关数据展示
     * @param name
     * @return
     */
    public String selectByName(String name){
       String result=productMapper.selectByName(name);
       if(result==null){
           System.out.println("你查询的商品不存在");

       }
       //往前端传
       else{
           Product product=new Product();
           product.getPname();
           product.getP_count();
           product.getP_price();
           product.getSold_count();
           product.getP_title();
           product.getP_discount();
           product.getSupport_province();
           product.getSupport_city();
          productMapper.showResult(product);
       }
     return  "";
    }

    /**
     * 查询商品的库存量
     * @param id
     * @return
     */
    public String selectCount(int id){
        int i = productMapper.selectCount(id);
        return "";

    }

}
