package com.itheima.homemorks;

public class Demo4 {
    public static void main(String[] args) {
        int a = 666;
        String res = a + "黑马程序员";
        System.out.println(res);
        System.out.println("res = " + res);
        System.out.println("a = " + a);
/*运行结果：
666黑马程序员
res = 666黑马程序员
a = 666
*/
        // 案例2:
        System.out.println(666 + "黑马程序员");
        System.out.println(66 + 6 + "黑马程序员");
        System.out.println(66 + "黑马程序员" + 6);
    }
}
/*
运行结果：
666黑马程序员
72黑马程序员
66黑马程序员6
*/

