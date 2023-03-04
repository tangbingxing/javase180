package day7.print;

public class PrintRhombus {
    public static void main(String[] args) {
        //控制层数
        for (int i = 0; i < 7; i++) {
            //控制每行空格的数量
            for (int n = 0; n < 7 - i; n++) {
                System.out.print(" ");
            }
            //控制每行*的数量
            for (int m = 0; m < 2*i-1; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
