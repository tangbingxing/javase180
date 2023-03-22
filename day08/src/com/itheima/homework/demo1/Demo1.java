package com.itheima.homework.demo1;

/*
 *   系统用户名和密码  itheima  123456
 *   登录成功，欢迎进入系统！
 *   最多三次登录机会
 * */

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("请输入用户名: ");
            String userName = sca.next();
            System.out.print("请输入用户密码: ");
            String password = sca.next();

            if (cheek(userName, password)) {
                System.out.println("欢迎进入系统！");
                return;
            } else {
                System.out.println("输入有误，请重新输入。还剩" + (2-i) + "次机会");
            }
        }
    }

    public static boolean cheek(String userName, String password) {
        String name = "itheima";
        String psw = "123456";
        boolean a = name.equals(userName);
        boolean b = psw.equals(password);
        return a & b;
    }
}
