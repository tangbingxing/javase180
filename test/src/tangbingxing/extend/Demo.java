package tangbingxing.extend;

public class Demo {
    public static void main(String[] args) {
        Cat cat = new Cat(10);
        //子类可以调用父类的属性和方法
        cat.setName("Cat");
        System.out.println("cat.getName() = " + cat.getName());
        cat.run();
        //子类也可以有自己的属性和方法
        cat.getAge();
        cat.eat();
        System.out.println("--------------");

        Tiger tiger = new Tiger();
        //子类可以继承父类的父类
        tiger.setName("Tiger");
        System.out.println("tiger.getName() = " + tiger.getName());
        tiger.run();
    }
}
