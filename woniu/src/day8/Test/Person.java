package day8.Test;

public class Person {
    //成员属性
    private String name;
    private String address;
    private int age;

    //成员方法
    public void eat() {
        System.out.println("eat");
    }

    public void run() {
        System.out.println("run");
    }

    //构造器
        //无参

    public Person() {
    }


    //有参

    public Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }


    //toString方法

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + address + '\'' +
                ", age=" + age +
                '}';
    }


    //get 和set 方法


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
