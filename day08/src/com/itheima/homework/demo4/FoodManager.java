package com.itheima.homework.demo4;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodManager {
    //用集合存储菜品信息
    private ArrayList<Food> foodList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    //显示管理菜单系统
    public void menu() {
        while (true) {
            System.out.println("欢迎来到菜品管理系统");
            System.out.println("1.添加菜品");
            System.out.println("2.展示菜品");
            System.out.println("3.退出系统");
            System.out.println("请选择功能");
            int key = sc.nextInt();
            switch (key) {
                case 1:
                    addFood();
                    break;
                case 2:
                    showFood();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("你的输入有误，请重新输入！");
            }
        }
    }

    //添加菜品

    public void addFood() {
        Food food = new Food();
        System.out.print("请输入菜名:");
        String name = sc.next();
        food.setName(name);
        System.out.print("请输入原价:");
        double originalPrice = sc.nextDouble();
        food.setOriginalPrice(originalPrice);
        System.out.print("请输入优惠价:");
        double specialPrice = sc.nextDouble();
        food.setSpecialPrice(specialPrice);
        System.out.print("请输入其他信息:");
        String info = sc.next();
        food.setInfo(info);

        foodList.add(food);
        System.out.println("-----输入菜品信息成功———-----");
    }

    //展示所有菜品
    public void showFood() {
        //读取集合里面的所有元素
        for (int i = 0; i < foodList.size(); i++) {
            Food food = foodList.get(i);
            System.out.println("菜品名称" + food.getName());
            System.out.println("菜品原价" + food.getOriginalPrice());
            System.out.println("菜品优惠价" + food.getSpecialPrice());
            System.out.println("菜品其他信息" + food.getInfo());
            System.out.println("----------");
        }
    }
}
