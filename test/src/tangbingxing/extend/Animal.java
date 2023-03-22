package tangbingxing.extend;

//动物类
public class Animal extends Object{
    //属性
    private String name;
    //方法
    public void run() {
        System.out.println("Animal can run");
    }

    //构造器

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    //getter 和 setter方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
