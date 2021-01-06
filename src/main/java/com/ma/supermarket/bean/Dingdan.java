package com.ma.supermarket.bean;

public class Dingdan {
    private String id;//订单id
    private String received;//已收货
    private String waiting;//待收货
    private String sending;//未发货
    private String evaluted;//已评价
    private String evaluting;//未评价
    private String moneying;//未付款

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReceived() {
        return received;
    }

    public void setReceived(String received) {
        this.received = received;
    }

    public String getWaiting() {
        return waiting;
    }

    public void setWaiting(String waiting) {
        this.waiting = waiting;
    }

    public String getSending() {
        return sending;
    }

    public void setSending(String sending) {
        this.sending = sending;
    }

    public String getEvaluted() {
        return evaluted;
    }

    public void setEvaluted(String evaluted) {
        this.evaluted = evaluted;
    }

    public String getEvaluting() {
        return evaluting;
    }

    public void setEvaluting(String evaluting) {
        this.evaluting = evaluting;
    }

    public String getMoneying() {
        return moneying;
    }

    public void setMoneying(String moneying) {
        this.moneying = moneying;
    }
}