package day03;

/**
 * 分支结构if...else if的演示
 */
public class IfElseIfDemo {
    public static void main(String[] args) {
        //1)满2000打5折，满1000不满2000打7折，满500不满1000打8折，不满500打9折:
        double price = 6000.0;
        if(price>=2000){
            price*=0.5;
        }else if(price>=1000){
            price*=0.7;
        }else if(price>=500){
            price*=0.8;
        }else{
            price*=0.9;
        }
        System.out.println("最终消费金额为:"+price);
    }
}

















