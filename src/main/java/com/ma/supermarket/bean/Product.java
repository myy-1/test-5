package com.ma.supermarket.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;//商品id
    private String pname;//商品名字
    private int p_count;//商品库存
    private BigDecimal p_price;//商品价格
    private int sold_count;//商品销量
    private String p_title;//商品标题
    private BigDecimal p_discount;//商品优惠价格
    private Date begintime;//开始优惠时间
    private Date endtime;//优惠截止时间
    private Date createtime;//操作数据的时间
    private Date updatetime;//更新数据的时间
    private String support_province;//供应省份
    private String support_city;//供应城市

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getP_count() {
        return p_count;
    }

    public void setP_count(int p_count) {
        this.p_count = p_count;
    }

    public BigDecimal getP_price() {
        return p_price;
    }

    public void setP_price(BigDecimal p_price) {
        this.p_price = p_price;
    }

    public int getSold_count() {
        return sold_count;
    }

    public void setSold_count(int sold_count) {
        this.sold_count = sold_count;
    }

    public String getP_title() {
        return p_title;
    }

    public void setP_title(String p_title) {
        this.p_title = p_title;
    }

    public BigDecimal getP_discount() {
        return p_discount;
    }

    public void setP_discount(BigDecimal p_discount) {
        this.p_discount = p_discount;
    }

    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getSupport_province() {
        return support_province;
    }

    public void setSupport_province(String support_province) {
        this.support_province = support_province;
    }

    public String getSupport_city() {
        return support_city;
    }

    public void setSupport_city(String support_city) {
        this.support_city = support_city;
    }
}