package com.itheima.homemorks;

//需求: 编写程序,演示自动类型转换和强制类型转换

public class Demo3 {
    public static void main(String[] args) {
        //自动类型转换
        int a = 4;
        byte b = 2;
        //自动转换为int类型
        System.out.println(a + b);

        //强制类型转换
        int c = 5;
        double d = 6.5;
        //强制转换为int类型
        System.out.println((int)(c + d));

    }
}
