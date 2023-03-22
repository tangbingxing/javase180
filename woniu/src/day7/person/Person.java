package day7.person;

public class Person {
    //定义变量，并私有化
    private String name;
    private int age;
    private String gender;
    private double salary;
    private double height;
    //无参构造器

    public Person() {
    }


    //有参构造器

    public Person(String name, int age, String gender, double salary, double height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.height = height;
    }


    //定义成员方法，打印信息

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", height=" + height +
                '}';
    }


    //定义 get和set方法

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
