package com.itheima.homework.demo2;

/*随机产生验证码，包含数字，大写字母，小写字母*/

import java.util.Random;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println(authCode(12));
    }
    public static String authCode(int n) {
        //准备验证码所需的字符
        String code = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //准备接收生成验证码的变量
        String auth = "";

        //生成随机数
        Random r = new Random();
        //每次取出一个字符，拼接到验证码变量上
        for (int i = 0; i < n; i++) {
            //获取随机索引
            int index = r.nextInt(code.length());
            //拼接验证码
            auth += code.charAt(index);
        }
        return auth;
    }
}
