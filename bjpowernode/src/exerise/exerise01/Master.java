package exerise.exerise01;

/**
 * @author tangbingxing
 * @version 1.0
 * 铲屎官类
 */
public class Master {
    //定义名称属性
    private String name;
    
    //定义构造器

    public Master() {
    }

    public Master(String name) {
        this.name = name;
    }

    //定义喂食方法
    public void feed(Pet pet) {
        System.out.println(getName() + "开始喂食");
        System.out.println(pet.eat());
        System.out.println(getName() + "喂食完毕");
    }
    
    //getter 和 setter 方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
