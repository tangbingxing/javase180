package org.example;

public class CodeTest {
    int a=2;

    public void test() {
        System.out.println("Code test");
        System.out.println(a);
    }

    {
        a = 10;
        System.out.println(a);
    }

    {
        System.out.println();
    }

}
