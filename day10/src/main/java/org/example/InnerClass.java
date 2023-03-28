package org.example;

public class InnerClass {

    //内部类 (成员内部类)
    public class test{
        int i = 1;

        public void stat() {
            System.out.println("inner test");
        }
    }

    // 静态成员内部类
    public static  class test1 {
        //i = 2;
        int n = 2;
        public void stat() {
            System.out.println("static inner test2");
        }

    }

    public void eat() {
        //局部内部类
        class test {

        }

        //匿名内部类

    }
}
