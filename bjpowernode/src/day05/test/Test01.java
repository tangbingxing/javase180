package day05.test;

        /*
        编写程序，定义一个int类型变量，指定其值，可以是任意整数，如10、11；
        结合算术运算符、条件运算符，得出其是奇数，还是偶数，并输出。
        如int intVariable = 10;，则输出”偶数”；如果int intVariable = 11;，则输出“奇数“
*/

public class Test01 {
    public static void main(String[] args) {
        //定义整数
        int intNum = 11;
        //判断奇数还是偶数
        String res = intNum%2 == 0? "偶数":"奇数";
        System.out.println(res);
    }
}
