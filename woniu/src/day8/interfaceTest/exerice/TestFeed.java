package day8.interfaceTest.exerice;

//这是一个

public class TestFeed {
    public static void main(String[] args) {
        //创建一个Cat类，由Animal 接收
        //左边时编译类型，右边是运行类型
        Animal cat = new Cat("猫");
        Food fish = new Fish("鱼");
        Feeder master = new Feeder("饲养员");
        master.feedWay(cat, fish);

        Animal dog = new Dog("狗");
        Food bond = new Bond("骨头");
        Feeder master1 = new Feeder("动物园饲养员");
        master1.feedWay(dog,bond);
    }
}
