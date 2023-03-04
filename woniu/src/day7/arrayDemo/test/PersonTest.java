package day7.arrayDemo.test;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("Tom", 18, 1.75);
        System.out.println(p.toString());
    }
}
// Person类
class Person {
    private String name;
    private int age;
    private double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String toString() {
        return String.format("name: %s, age: %d, height: %f", name, age, height);
    }
}

// PersonTest类
