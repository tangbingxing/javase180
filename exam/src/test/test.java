package test;

import java.util.Random;

public class test {
    public static void main(String[] args) {
        int a = 1, b = 3, c = 5, d = 4, x;

        if (a < b) {
            if (c < d) {
                x = 1;
            } else if (a < c) {
                if (b < d) {
                    x = 2;
                } else {
                    x = 3;
                }
            } else {
                x = 6;
            }
        } else {
            x = 7;
        }

        System.out.println(x);
    }
}
//<font color="red"> </font>