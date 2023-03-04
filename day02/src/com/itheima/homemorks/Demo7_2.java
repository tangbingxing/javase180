package com.itheima.homemorks;

//编写程序,获取2个整数的最大值\最小值.

public class Demo7_2 {
    public static void main(String[] args) {
        int a = 12;
        int b = 23;
        int max = a > b ? a : b;
        int min = a < b ? a : b;
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
