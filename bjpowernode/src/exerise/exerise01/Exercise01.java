package exerise.exerise01;

/**
 * @author tangbingxing
 * @version 1.0
 * 编写程序，实现铲屎官投喂拥有的多种宠物的功能，要求如下
 *
 * 1. 有宠物父类Pet，具有名称属性，具备吃东西的行为
 *
 * 2. 有各种宠物子类如Dog、Cat、Bird等，继承Pet类，各种宠物都具备自己吃东西的行为
 *
 * 3. 有铲屎官类，根据不同的宠物，都能实现投喂
 *
 */
public class Exercise01 {
    //定义主方法
    public static void main(String[] args) {
        Pet dog = new Dog("二哈");
        Pet cat = new Cat("汤姆");
        Master master = new Master("主人");
        master.feed(dog);
        master.feed(cat);
    }
}
