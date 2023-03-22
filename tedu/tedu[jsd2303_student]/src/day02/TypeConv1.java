package src.day02;

public class TypeConv1 {
    public static void main(String[] args) {
        byte b1 = 5;
        byte b2 = 6;
        byte b3 = (byte) (b1 + b2);

        System.out.println(2 + 2);
        System.out.println(2 + '2');
        System.out.println('2' + '2');
        System.out.println('2');

        int a = 'a';
        System.out.println(a);
        char c = 97;
        System.out.println(c);


        /*int a = 5;
        long b = a;
        int c = (int)b;


        long d = 5;
        double e = 5;

        long f = 10000000000L;
        int g = (int)f;
        System.out.println(g);

        double h = 25.987;
        int i = (int)h;
        System.out.println(i);*/

    }
}
