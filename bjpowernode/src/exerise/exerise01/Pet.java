package exerise.exerise01;

/**
 * @author tangbingxing
 * @version 1.0
 * 宠物  父类
 */
public abstract class Pet {
//    定义名称属性，并私有化
    private String name;

    //构造器

    public Pet() {
    }

    public Pet(String name) {
        this.name = name;
    }

    public abstract String eat();



    //getter 和 setter 方法


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
