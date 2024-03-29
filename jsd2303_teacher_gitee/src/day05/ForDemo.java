package day05;

/**
 * for的特殊格式、break、continue的演示
 */
public class ForDemo {
    public static void main(String[] args) {
        //输出9的乘法表，只要不能被3整除的
        for(int num=1;num<=9;num++){
            if(num%3!=0){
                System.out.println(num+"*9="+num*9);
            }
        }

        //输出9的乘法表，跳过能被3整除的
        for(int num=1;num<=9;num++){
            if(num%3==0){
                continue; //跳过循环体中剩余语句而进入到下一次循环
            }
            System.out.println(num+"*9="+num*9);
        }
        /*
          num=1  1*9=9
          num=2  2*9=18
          num=3
          num=4  4*9=36
          num=5  5*9=45
          num=6
          num=7  7*9=63
          num=8  8*9=72
          num=9
          num=10
         */

        /*
        for(int num=1;num<=9;num++){
            if(num==4){ //在某种特定条件下，提前结束循环
                break;  //跳出循环
            }
            System.out.println(num+"*9="+num*9);
        }
         */
        /*
          num=1  1*9=9
          num=2  2*9=18
          num=3  3*9=27
          num=4
         */











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

        /*
        for(int i=0,j=5;i<=5;i+=2,j-=2){
            System.out.println(i+","+j);
        }
         */
        /*
          i=0,j=5
          i=2,j=3
          i=4,j=1
          i=6,j=-1
         */


    }
}

















