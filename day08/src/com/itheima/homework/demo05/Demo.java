package com.itheima.homework.demo05;

/*
 * 请编写程序，由键盘录入一个字符串，统计字符串中英文字母和数字分别有多少个。比如：Hello12345World中字母：10个，数字：5个。
 *
 * */

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串: ");
        String str = sc.next();
        count(str);

    }

    public static void count(String str) {
        //定义变量统计字母和数字的数量
        int numCount = 0;
        int charCount = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            if (a >= '0' && a <= '9') {
                numCount++;
            } else if (a >= 'a' && a <= 'z') {
                charCount++;
            }
        }
        System.out.println(str + "中字母：" + charCount + "个，数字：" + numCount + "个。");
    }
}
