package test02;

//定义手机类，手机有品牌(brand),价格(price)和颜色(color)三个属性，有打电话call()和sendMessage()两个功能。
public class Phone {
    //定义成员属性，并私有化
    private String brand;
    private int price;
    private String color;


    //定义成员方法，实现打电话的功能
    public void call() {
        System.out.println("正在使用价格为" + price + "元" + color + "的" + brand + "手机打电话....");
    }

    //定义成员方法，实现发短信的功能
    public void sendMessage() {
        System.out.println("正在使用价格为" + price + "元" + color + "的" + brand + "手机发短信....");
    }

    //提供有参和无参构造器

    public Phone() {
    }

    public Phone(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }


    //提供getter 和 setter 方法

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
