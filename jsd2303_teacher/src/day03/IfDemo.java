package day03;

/**
 * 分支结构if的演示
 */
public class IfDemo {
    public static void main(String[] args) {
        //1)满500打8折:
        double price = 300.0; //消费金额   带数(600.0,300.0)
        if(price>=500){ //满500
            price*=0.8; //打8折
        }
        System.out.println("最终消费金额为:"+price);

        //判断成绩是否合法:
        int score = 555; //带数(95,-5,555)
        if(score>=0 && score<=100){
            System.out.println("成绩合法");
        }
        System.out.println("继续执行...");

    }
}




















