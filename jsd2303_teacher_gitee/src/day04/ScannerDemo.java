package day04;
import java.util.Scanner; //1.导入扫描仪
/**
 * Scanner的演示
 */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //2.新建一个扫描仪叫scan
        System.out.println("请输入年龄:");
        int age = scan.nextInt(); //3.扫描一个整数并赋值给age
        System.out.println("请输入商品价格:");
        double price = scan.nextDouble(); //4.扫描一个小数并赋值给price

        System.out.println("年龄为:"+age+"，商品价格为:"+price);
    }
}



















