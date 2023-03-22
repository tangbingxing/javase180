package test;

/*
    提示用户控制台输入一个大于 0 的整数代表月份，若用户输入数据合法，则输出该月份
    属于的季度，否则给出错误提示并结束程序。
* */

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入月份:");
        int month = sc.nextInt();
        if(month < 1 || month > 12) {
            System.out.println("你输入的月份不合法");
        } else if(month >= 1 && month <= 3 ) {
            System.out.println(month + "月属于第一季度");
        } else if(month >= 4 && month <= 6) {
            System.out.println(month + "月属于第二季度");
        } else if(month >= 7 && month <= 9) {
            System.out.println(month + "月属于第三季度");
        } else if(month >= 10 && month <= 12) {
            System.out.println(month + "月属于第四季度");
        }
    }
}
