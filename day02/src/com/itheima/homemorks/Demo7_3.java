package com.itheima.homemorks;

public class Demo7_3 {
    public static void main(String[] args) {
        int a = 14, b = 23, c = 15;
        int tempMax = a > b? a : b;
        int max = tempMax > c?tempMax : c;
        int tempMin = a < b? a : b;
        int min = tempMin < c ? tempMin : c;
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
