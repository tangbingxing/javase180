package day05.exercise;

/*
 * 编写程序，判断是否为**水仙花数**，输入一个正整数，先判断其是否为三位数，
 * 如果不是，直接提示，如果是，再检查其是否为水仙花数，并分别提示，使用嵌套if...else...实现
 * */

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        //定义整数变量
        int intThreeNum;

        //从控制台接收输入
        Scanner sca = new Scanner(System.in);
        System.out.print("请输入一个三位数的正整数: ");
        intThreeNum = sca.nextInt();

        //判断输入的整数是否位三位数的正整数   使用嵌套if else 实现
        if (intThreeNum > 99 && intThreeNum < 1000) {
            //检查其是否为水仙华数并输出提示
            int one = intThreeNum % 10;
            int ten = intThreeNum / 10 % 10;
            int hundred = intThreeNum / 100 % 10;

            if (one * one * one + ten * ten * ten + hundred * hundred * hundred == intThreeNum) {
                System.out.println(intThreeNum + "是水仙花数");
            } else {
                System.out.println(intThreeNum + "不是水仙花数");
            }
        } else {
            System.out.println("你输入的数字有误，请重新输入");
        }
    }
}
