package day05.exercise;
/*
 * 打印所有的水仙花数
 * */

public class Exercise04 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int one = i % 10;
            int ten = i / 10 % 10;
            int hundred = i / 100 % 10;
            if (one * one * one + ten * ten * ten + hundred * hundred * hundred == i) {
                System.out.println(i + "是水仙花数");
            }
        }
    }
}
