package com.itheima.homemorks;

//需求: 一个四位数，将其拆分为个位、十位、百位、千位后，打印在控制台

public class Demo5 {
    public static void main(String[] args) {
        int a = 1234;
        int qian = a / 1000 % 10;
        int bai = a / 100 % 10;
        int shi = a / 10 % 10;
        int ge = a % 10;
        System.out.println("qian = " + qian);
        System.out.println("bai = " + bai);
        System.out.println("shi = " + shi);
        System.out.println("ge = " + ge);
    }
}
