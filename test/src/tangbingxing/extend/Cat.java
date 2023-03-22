package tangbingxing.extend;

//猫科
public class Cat extends Animal{
    //属性
    private int age;
    //方法
    public void eat() {
        System.out.println("Cat want to eat meat");
    }

    @Override
    public void run() {
        System.out.println("Cat can run");
    }
    //构造器

    public Cat() {
    }

    public Cat(int age) {
        this.age = age;
    }

    //getter setter方法

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
