package smallchange;

import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        //控制do while 循环的终止条件
        boolean loop = true;
        //读取用户键盘输入
        Scanner myScanner = new Scanner(System.in);
        String key;
        do {
            System.out.println("------零钱通------");
            System.out.println("\t\t\t1  明细");
            System.out.println("\t\t\t2  入账");
            System.out.println("\t\t\t3  消费");
            System.out.println("\t\t\t4  退出");
            System.out.println("请选择（1-4）:");
            key = myScanner.next();
            //使用switch 控制分支结构
            switch (key) {
                case "1":
                    System.out.println();
                    break;
                case "2":
                    System.out.println("2  入账");
                    System.out.println("入账 + 100 余额  100.00");
                    System.out.println("入账 + 100 余额  200.00");
                    break;
                case "3":
                    System.out.println("3  消费");
                    System.out.println("消费 + 100 余额  100.00");
                    break;
                case "4":
                    System.out.println("4  退出");
                    loop = false;
                    break;
                default:
                    System.out.println("输入错误，请选择（1-4）:");
            }
        } while(loop);
        System.out.println("---退出了零钱通项目---");
    }
}
