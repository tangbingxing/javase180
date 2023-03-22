package homework.demo5;

/*
电影的ID、名称、价格
*/

public class Movies {
    //成员属性
    private int ID;
    private String name;
    private double price;
    //构造方法

    public Movies() {
    }

    public Movies(int ID, String name, double price) {
        this.ID = ID;
        this.name = name;
        this.price = price;
    }

    //getter setter方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
