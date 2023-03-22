package com.itheima.homework.demo4;


//完成菜品的上架，以及菜品浏览功能

public class Food {
    //菜名name 原价格 originalPrice  优惠价格specialPrice  其他信息  info
    private String name;
    private double originalPrice;
    private double specialPrice;
    private String info;


    //构造方法

    public Food(String name, double originalPrice, double specialPrice, String info) {
        this.name = name;
        this.originalPrice = originalPrice;
        this.specialPrice = specialPrice;
        this.info = info;
    }

    public Food() {
    }

    //get 和 set 方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public double getSpecialPrice() {
        return specialPrice;
    }

    public void setSpecialPrice(double specialPrice) {
        this.specialPrice = specialPrice;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
