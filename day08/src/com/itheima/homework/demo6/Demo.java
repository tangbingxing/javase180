package com.itheima.homework.demo6;
/*
我国的居民身份证号码，由十七位数字本体码和一位数字校验码组成。
请定义方法判断用户输入的身份证号码是否合法，并在主方法中调用方法测试结果。
规则为：号码为18位，不能以数字0开头，前17位只可以是数字，最后一位可以是数字或者大写字母X。
*/

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        //键盘输入身份证
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你的身份证号码: ");
        String ID = sc.next();
        checkID(ID);
    }

    //校验身份证
    public static void checkID(String ID) {
        char a = ID.charAt(ID.length() - 1);
        //号码要有18位
        if (ID.length() != 18) {
            System.out.println("身份证不符合18位，请检查是否有漏输或者多输");
        } else if (ID.startsWith("0")) { // 不能以 0 开头
            System.out.println("以0开头，错误");
        } else if (!((a >= '0' & a <= '9') || (a == 'X'))) { //最后一位可以是数字或者大写字母 'X'
            System.out.println("你输入的最后一位有误，请重新输入");
        } else {
            for (int i = 0; i < ID.length() - 1; i++) {  //前17位只能是数字
                //取出字符串中的每个字符
                char aa = ID.charAt(i);
                //判断字符是否位数字
                if (!(aa >= '0' & aa <= '9')) {
                    System.out.println("你输入前17位必须是数字，请重新输入");
                    return;
                }
            }
            System.out.println("你的身份信息输入成功");
        }
    }
}
