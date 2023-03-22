package day05.test;
/*
* 编写程序，接收输入一个整数，判断其是正数、负数，还是0，如：

1. 输入-3，输出"-3是负数。"
2. 输入3，输出"3是正数。"
3. 输入0，输出"0是零。"
* */

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        //接收一个整数
        int intNum;
        Scanner sca = new Scanner(System.in);
        System.out.println("输入一个整数");
        intNum = sca.nextInt();
        //判断其为正数，负数还是零
        String res = intNum == 0? "0是零" : intNum > 0 ? (intNum + "是正数"):(intNum + "是负数");
        System.out.println(res);
    }
}
