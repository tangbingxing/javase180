package org.innerDemo;

/*演示内部类
类里面又定义了一个类，这个类就叫内部类，外面的类叫外部类；其他的类叫外部其他类
内部类可以访问外部类的所有成员方法和属性，同时遵循就近原则
* private
根据内部类定义的位置不同，又分为以下两种
* 成员内部类
* 局部内部类   不能用public和private修饰，它的作用域只在定义它的方法或者代码块内
*
* static
* 匿名内部类
* 静态内部类
*
*
* */

public class InnerDemo1 {
    int i = 1;
    public class InnerDemo2 {
        int i = 2;
        public void test() {
            System.out.println("成员内部类" + i);
            class InnerDemo3{
                int i = 3;
                public void test() {
                    System.out.println("定义在方法中的局部内部类" + i);
                }
            }

            {
               class InnerDemo4 {
                   int i = 4;
                   public void test() {
                       System.out.println("定义在代码块中的局部内部类" + i);
                   }
               }
            };
        }
        void test2() {
            System.out.println("InnerDemo2.test2");
        }
    }
    public static class InnerDemo5 {
        int i = 5;
        public void test() {
            System.out.println("静态内部类" + i);
        }
        public static void test1() {
            int i = 5;
            System.out.println("静态内部类的静态方法" + i);//无法访问外部类的非静态变量
        }
    }

    public void test() {
        System.out.println("外部类" + i);
    }
}
