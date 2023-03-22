package com.itheima.homeworks;

//请分析其中会出现错误的代码，描述错误原因，并进行修正。将修正后的代码写入文件中，查看运行结果。

public class demo05 {
    public static void main(String[] args) {
        // 作用域: 一对大括号
        // 片段1
        //int a = 10;
        {
            int a = 20;
            System.out.println(a);
        }

        // 片段2
        {
            int b = 20;
            System.out.println(b);
        }
        //可能出现问题的代码，超出变量b 的定义域
        // b = 30;  //错误行代码
        // 解决方法：可重新定义b   或将括号范围覆盖至输出语句后
        int b = 30;
        System.out.println(b);
    }
}

