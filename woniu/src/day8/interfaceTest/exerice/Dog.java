package day8.interfaceTest.exerice;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) {
        System.out.println("狗吃" + food);
    }
}
