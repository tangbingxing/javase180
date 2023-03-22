package tangbingxing.demo;

public class Person {
    //创建并私有化成员属性
    private String name;
    private int age;
    private char gender;

    public void say() {
        System.out.println("我是人类");
    }

    //私有化的成员属性必须提供getter和setter方法
    //getter是获取成员属性的方法
    //setter是修改成员属性的方法
    //可以在方法中通过业务逻辑实现对属性的规范化

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
