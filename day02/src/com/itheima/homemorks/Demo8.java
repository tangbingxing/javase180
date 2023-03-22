package com.itheima.homemorks;

import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的姓名");
        String name = sc.next();
        System.out.println("请输入学生的年龄");
        int age = sc.nextInt();

        System.out.println("name = " + name);
        System.out.println("age = " + age);

    }
}
