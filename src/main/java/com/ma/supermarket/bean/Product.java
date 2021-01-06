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
    private String pid;

    private String pname;

    private BigDecimal price;

    private BigDecimal  cuxiao_price;

    private Date begintime;

    private Date endtimme;

    private int kuncun;

    private String supptor;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getCuxiao_price() {
        return cuxiao_price;
    }

    public void setCuxiao_price(BigDecimal cuxiao_price) {
        this.cuxiao_price = cuxiao_price;
    }

    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    public Date getEndtimme() {
        return endtimme;
    }

    public void setEndtimme(Date endtimme) {
        this.endtimme = endtimme;
    }

    public int getKuncun() {
        return kuncun;
    }

    public void setKuncun(int kuncun) {
        this.kuncun = kuncun;
    }

    public String getSupptor() {
        return supptor;
    }

    public void setSupptor(String supptor) {
        this.supptor = supptor;
    }
}