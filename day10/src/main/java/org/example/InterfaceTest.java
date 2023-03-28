package org.example;

//接口必须通过类实现
public interface InterfaceTest {
    //可以定义属性
    int c = 1;
    static int b = 1;
    public int a = 1;
    /*不能使用private修饰符修饰*/

    //private int d = 2;


    //可以定义方法，默认用public abstract 修饰
    void test();
    void test1();

}
