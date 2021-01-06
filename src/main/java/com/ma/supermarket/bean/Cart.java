package com.ma.supermarket.bean;

/**
 * @Author: 马月月
 * @Date: 2021/1/5 15:37
 * @Description:
 */
public class Cart {
    private String cartid;//购物车id
    private String uid;//用户id

    public String getCartid() {
        return cartid;
    }

    public void setCartid(String cartid) {
        this.cartid = cartid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
