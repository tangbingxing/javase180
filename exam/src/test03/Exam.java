package test03;


//提示用户键盘录入一个包含数字和字母的字符串（不做是否包含数字和字母的判断），统计数字和字母(包含大小写)各多少个,打印输出!

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个包含数字和字母的字符串");
        String str = sc.next();
        countNum(str);
    }

    //统计数字个数的方法
    public static void countNum(String str) {
        //定义一个int类型变量接收数字个数
        int numCount = 0;
        //定义一个int类型变量接收字母个数
        int charCount = 0;
        //将字符串的字母全部转换为小写字母判断
        String str1 = str.toLowerCase();
        //遍历字符串，并对每个字符进行判断
        for (int i = 0; i < str1.length(); i++) {
            //定义一个字符类型变量接收从字符串里取出的字符
            char str2 = str1.charAt(i);
            //统计数字、字母个数
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                numCount++;
            } else if (str2 >= 'a' && str2 <= 'z') {
                charCount++;
            }
        }
        //打印输出
        System.out.println("数字有" + numCount + "个，字母(包含大小写)有" + charCount + "个");
    }
}
