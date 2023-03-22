package homework.demo4;

/*定义狗类Dog。属性:毛的颜色color，品种breed。行为:吃饭()，看家lookHome()*/
public class Dog {
    //成员属性
    private String color;
    private String breed;

    //成员方法
    public void eat() {
        System.out.println(color + "的" + breed + "正在啃骨头.....");
    }

    public void lookHome() {
        System.out.println(color + "的" + breed + "正在看家.....");
    }
    //构造器

    public Dog() {
    }

    public Dog(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    //getter setter

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
