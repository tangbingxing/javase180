package day8.Test;

public class Boy extends Person {
    private double height;
    private double weight;

    //构造器
    //无参

    public Boy() {
    }

    //有参


    public Boy(String name, String gender, int age, double height, double weight) {
        super(name, gender, age);
        this.height = height;
        this.weight = weight;
    }

    //toString方法

    @Override
    public String toString() {
        return "Boy{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }


    //get 和 set 方法

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
