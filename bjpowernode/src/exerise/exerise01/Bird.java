package exerise.exerise01;

/**
 * @author tangbingxing
 * @version 1.0
 * 鸟类
 */
public class Bird extends Pet{
    public Bird() {
    }

    public Bird(String name) {
        super(name);
    }

    @Override
    public String eat() {
        String s = getName() + "在吃虫子！";
        return s;
    }
}
