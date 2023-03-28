

/*
四个数字中的最大值
	程序应从键盘读取这些数字。
	程序必须在屏幕上显示一个数字。
	程序应显示四个数字中的最大值。
	如果有多个最大数字，则显示其中任意一个。
        8
        9
        5
        8

*
* */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());

        int max1 = a > b ? a : b;
        int max2 = c > d ? c : d;
        int max = max1 > max2 ? max1 : max2;
        System.out.println(max);
    }

}


