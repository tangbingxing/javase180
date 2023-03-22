package day8.interfaceTest;

//  接口的具体实现

public class AAA implements AAAA{

    //静态常量的定义
    //使用final 关键字 ，静态常量的变量名都采用大写（习惯上的约定）
    public final double PI = 3.14;

    @Override
    public int say(int a, int b) {
        return a + b;
    }
}
