package exerise.exerise01;

/**
 * @author tangbingxing
 * @version 1.0
 * 猫类
 */
public class Cat extends Pet{
    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public String eat() {
        String s = getName() + "在吃鱼！";
        return s;
    }
}
