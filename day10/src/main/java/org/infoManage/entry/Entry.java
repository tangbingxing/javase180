package org.infoManage.entry;


import org.infoManage.control.StudentControl;

import java.util.Scanner;

//这里是程序入口
public class Entry {
    public static void main(String[] args) {
        //启动程序
        start();
    }

    //启动
    private static void start() {
        loop:while (true) {
            Scanner sc = new Scanner(System.in);
            //显示页面信息
            System.out.println("Welcome to Info Manage System");
            System.out.println("Choice Operation");
            System.out.println("1.Student Info Manage");
            System.out.println("2.Exit");
            //接收用户输入
            int choice = sc.nextInt();
            //根据用户的不同选择进入不同分支
            switch (choice) {
                case 1:
                    StudentControl studentControl = new StudentControl();
                    studentControl.start();
                    break;
                case 2:
                    System.out.println("Welcome Next Time!");
                    break loop;
            }
        }
    }
}
