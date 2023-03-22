package exerise.exerise01;

/**
 * @author tangbingxing
 * @version 1.0
 * 狗类
 */
public class Dog extends Pet{

    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public String eat() {
        String s = getName() + "在吃骨头！";
        return s;
    }
}
