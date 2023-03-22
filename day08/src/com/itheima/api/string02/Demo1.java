package com.itheima.api.string02;

/*
* 生成随机验证码
* */

import java.util.Random;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println(produce(3));
        System.out.println(produce(6));

    }

    //产生随机数
    public static String produce(int n){
            //定义验证码所需的字符
            String all = "abcdefgABCDEFG1234567890";
            //定义接收验证码的字符
            String code = "";

            //产生随机数
            Random r = new Random();
            for (int i = 0; i < n; i++) {
                int index = r.nextInt(all.length());
                code += all.charAt(index);

            }
            return code;
        }
}
