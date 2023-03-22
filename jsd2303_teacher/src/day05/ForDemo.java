package day05;

/**
 * for的特殊格式、break、continue的演示
 */
public class ForDemo {
    public static void main(String[] args) {
        /*
        int num=1;
        for(;num<=9;num++){
            System.out.println(num+"*9="+num*9);
        }
         */

        /*
        for(int num=1;num<=9;){
            System.out.println(num+"*9="+num*9);
            num++;
        }
         */

        /*
        for(;;){ //没有条件的循环就是个死循环
            System.out.println("我要学习...");
        }
         */

        for(int i=0,j=5;i<=5;i+=2,j-=2){
            System.out.println(i+","+j);
        }
        /*
          i=0,j=5
          i=2,j=3
          i=4,j=1
          i=6,j=-1
         */


    }
}

















