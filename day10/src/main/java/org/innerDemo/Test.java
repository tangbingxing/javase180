package org.innerDemo;

/*
* 内部类的调用
* 外部类，直接创建对象，用对象调用方法
*
*
* */

public class Test {
    public static void main(String[] args) {
        InnerDemo1 innerDemo1 = new InnerDemo1();
        innerDemo1.test();

        InnerDemo1.InnerDemo5 innerDemo5 = new InnerDemo1.InnerDemo5();//静态内部类可以通过外部类.的方式创建
        innerDemo5.test();
        //innerDemo5.test1();//可以用对象调用静态方法，但更推荐用类名直接调用静态方法
        InnerDemo1.InnerDemo5.test1();

        InnerDemo1 innerDemo7 = new InnerDemo1() {
          public void test() {
              System.out.println("匿名内部类" + i);//可以直接访问外部类的属性和方法
              //test();
              System.out.println(getClass());//匿名内部类的名称是外部类名$加数字组成
          }
        };
        innerDemo7.test();
        innerDemo7.test();//访问的仍是同一个匿名内部类


        InnerDemo1 innerDemo8 = new InnerDemo1() {
            public void test() {
                System.out.println("匿名内部类" + i);//可以直接访问外部类的属性和方法
                //test();
                System.out.println(getClass());//匿名内部类的名称是外部类名$加数字组成
            }
        };
        innerDemo8.test();//访问的仍是同一个匿名内部类，只有重新定义一个才是新的匿名内部类
        innerDemo8.test();
    }
}
