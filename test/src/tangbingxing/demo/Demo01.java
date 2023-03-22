package tangbingxing.demo;

public class Demo01 {
    public static void main(String[] args) {
        //通过new一个类的构造方法，创建一个Person对象，并用Person接收
        Person person = new Person();
        //通过对象名.的方式可以直接调用类中属性和方法
        //调用成员属性
        //person.name = "Tom";  //私有化成员属性后不能直接调用
        //需要调用getter和setter方法来访问属性
        person.setName("Tom");
        person.getName();
        //调用成员方法
        person.say();
    }
}
