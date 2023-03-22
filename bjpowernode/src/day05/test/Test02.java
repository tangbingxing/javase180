package day05.test;

/*
* 编写程序，接收输入两个数，分别计算这两个数相加、相减、相乘、相除的结果，并输出
* */

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner sca = new Scanner(System.in);
        System.out.println("请输入两个数字，按回车结束输入");
        num1 = sca.nextInt();
        num2 = sca.nextInt();
        System.out.println("相加结果为" + (num1 + num2));
        System.out.println("相减结果为" + (num1 - num2));
        System.out.println("相乘结果为" + (num1 * num2));
        System.out.println("相除结果为" + (num1 / num2));
    }
}
