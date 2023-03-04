package day8.interfaceTest.exerice;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    public void eat(Food food) {
        System.out.println("猫吃" + food);
    }

}
