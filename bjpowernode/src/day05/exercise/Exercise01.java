package day05.exercise;

/*
* 编写程序，根据输入的整数，判断是否为3位整数，并输出判断结果；如789是3位整数，1234、12则不是3位整数
* */
import java.util.Scanner;
public class Exercise01 {
    public static void main(String[] args) {
        int threeNum;
        Scanner sca = new Scanner(System.in);
        System.out.println("请输入整数");
        threeNum = sca.nextInt();

        if(threeNum/100 == 0 || threeNum/1000 != 0) {
            System.out.println(threeNum + "不是3位整数");
        } else {
            System.out.println(threeNum + "是3位整数");
        }
    }
}
