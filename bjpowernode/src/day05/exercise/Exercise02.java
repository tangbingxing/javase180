package day05.exercise;

import java.util.Scanner;

/*
    编写程序，根据输入的校区（字符串，北京、上海、深圳等）、阶段（整数，共6个阶段），
    输出”在xx校区学习，简称x，学习到了第x阶段。”，使用嵌套if...else if...实现；
    如输入校区为上海、阶段为5，则输出”在北京校区学习，简称京，学习到了第五阶段。“

* */
public class Exercise02 {
    public static void main(String[] args) {
        //定义校区变量
        String schoolAddress;
        //定义阶段变量
        int stage;
        //定义简称变量
        char nickName;
        //读取控制台输入
        Scanner sca = new Scanner(System.in);
        System.out.print("请输入你的校区（北京、上海、深圳）: ");
        schoolAddress = sca.next();
        System.out.print("请输入你的学习阶段（1-6）: ");
        stage = sca.nextInt();
        //使用if else if 判断校区简称
        if("北京".equals(schoolAddress)) {
            nickName = '京';
        } else if("上海".equals(schoolAddress)) {
            nickName = '沪';
        } else if("深圳".equals(schoolAddress)) {
            nickName = '深';
        } else  {
            nickName = '0';
            System.out.println("你输入的校区有误，请重新输入");
            //退出方法
            return;
        }
        if(stage < 1 || stage > 6) {
            System.out.println("你输入的阶段有误，请重新输入");
        } else {
            System.out.println("在" + schoolAddress + "校区学习，简称" + nickName + "，学习到了第" + stage + "阶段");
        }
    }
}
