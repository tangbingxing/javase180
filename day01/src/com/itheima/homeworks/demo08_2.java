package com.itheima.homeworks;
    /*
    需求2： 假设公交车大人2元，小孩1元，公交车经过2站

            第一站：3个大人1个小孩上车
            第二站：1个大人1个小孩上车
            请问一共上了多少人，一共收入多少钱？
    */
public class demo08_2 {
    public static void main(String[] args) {
        int people, money;
        //第一站
        people = 3 + 1;
        money = 3*2 + 1;
        //第二站
        people = people + 1 + 1;
        money = money + 2 + 1;
        System.out.println("一共上了" + people + "人");
        System.out.println("一共收入" + money + "元");
    }
}
