package homework.demo1;
        /*
        手机有品牌(brand),价格(price)和颜色(color)三个属性，
        有打电话call()和sendMessage()两个功能。
        */

public class Phone {
    //成员属性  成员变量 （全局变量）
    private String brand;
    private int price;
    private String color;

    //成员方法
    public void call() {
        System.out.println("正在使用价格为" + price + "元" + color + "的" + brand + "手机打电话....");
    }

    public void sendMessage() {
        System.out.println("正在使用价格为" + price + "元" + color + "的" + brand + "手机发短信....");
    }

    //构造器

    public Phone(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public Phone() {
    }


    //get set

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
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
