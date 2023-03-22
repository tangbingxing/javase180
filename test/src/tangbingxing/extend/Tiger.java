package tangbingxing.extend;

//老虎类
public class Tiger extends Cat{
    //属性
    private char gender;
    //方法
    public void sex() {
        System.out.println("Tiger is male or female");
    }
    //构造器

    public Tiger() {
    }

    public Tiger(char gender) {
        this.gender = gender;
    }


    //getter setter方法

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
