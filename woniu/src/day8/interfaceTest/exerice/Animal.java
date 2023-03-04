package day8.interfaceTest.exerice;

//这是一个动物父类

public  class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat(Food food) {
        System.out.println("吃" + food);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
