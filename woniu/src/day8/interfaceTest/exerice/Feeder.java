package day8.interfaceTest.exerice;

//这是一个饲养员父类

public class Feeder {
    //私有化成员属性
    private String name;


    //public Feed(Animal animal,Food food) {
    //    System.out.println(animal + "吃" + food);
    //}

    //构造方法
    public Feeder(String name) {
        this.name = name;
    }

    //成员方法

    public void feedWay(Animal animal, Food food) {

        System.out.println(this.name + "喂" + animal.getName() + "吃" + food.getName());

    }

    //get 和 set 方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
