package day7.Object;

import java.util.Arrays;
import java.util.Collections;

public class Person {
    String name;
    String gender;
    int age;
    double height;
    double salary;

    //无参构造器


    public Person() {
    }

    //有参构造器


    public Person(String name, String gender, int age, double height, double salary) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.salary = salary;
    }
    //成员方法

    public void say() {
        System.out.println("我的姓名是" + name + "，我是" + gender + "孩子，我今年" + age + "岁,我的身高是" + height + "cm,我现在的工资是"+ salary +"元");
    }

    //给一个数组，并选择是正序和倒序排列，返回排列好后的数组

    public Integer[] sortArray(Integer[] arr,boolean Positive) {
        //创建一个新数组用来接收排序后的
        Integer[] newArr;
        //判断排序方式，如果输入true则按正序排序，如果输入false则按倒序排序
        if (Positive) {
            //正序排序实现方法
            Arrays.sort(arr);
        } else {
            //倒序排序实现方法
            Arrays.sort(arr, Collections.reverseOrder());
        }
        newArr = arr;
        return newArr;
    }
}
