package day05.test;
/*
* 编写程序，实现两个变量值交换，要求

1. 从控制台接收两个变量的值，变量名分别为first、second，然后输出
2. 交换两个变量的值，然后输出
3. 【扩展】可尝试不使用第3个变量进行first、second两个变量值交换
* */

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        //从控制台接收两个变量
        int first;
        int second;
        Scanner sca = new Scanner(System.in);
        System.out.println("请输入两个数，我将对其进行交换");
        first = sca.nextInt();
        second = sca.nextInt();
        System.out.println("交换前第一个数" + first + "第二个数" + second);

        //使用中间变量，交换两个变量的值
        int temp = first;
        first = second;
        second = temp;
        System.out.println("第一次交换后第一个数" + first + "第二个数" + second);

        //不使用中间变量，交换两个变量的值
        //按位异或，用第一个变量存储两个变量的值
        first ^= second;
        //按位异或，用第二个变量异或两个变量的值，实现取出第一个值的效果
        second ^= first;
        //按位异或，用第一个变量异或第二个变量的值，实现取出第二个值的效果，从而实现交换变量的值
        first ^= second;
        System.out.println("第二次交换后第一个数" + first + "第二个数" + second);
    }
}