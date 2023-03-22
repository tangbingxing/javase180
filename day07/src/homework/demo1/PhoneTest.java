package homework.demo1;
/*

定义手机类，手机有品牌(brand),价格(price)和颜色(color)三个属性，有打电话call()和sendMessage()两个功能。

        请定义出手机类，类中要有空参、有参构造方法，set/get方法。

        定义测试类，在主方法中使用空参构造创建对象，使用set方法赋值。

        调用对象的两个功能，打印效果如下：

        正在使用价格为3998元黑色的小米手机打电话....
        正在使用价格为3998元黑色的小米手机发短信....
*/

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setBrand("小米");
        phone.setPrice(3998);
        phone.setColor("黑色");
        phone.call();
        phone.sendMessage();
    }
}
