package test02;


//测试类
public class Exam {
    public static void main(String[] args) {
        //创建对象
        Phone phone = new Phone();

        //使用set方法赋值
        phone.setBrand("小米");
        phone.setPrice(3999);
        phone.setColor("黑色");

        //调用call() 和 sendMessage() 功能
        phone.call();
        phone.sendMessage();
    }
}
