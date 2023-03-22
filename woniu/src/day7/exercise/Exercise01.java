package day7.exercise;

public class Exercise01 {
    //定义属性，并私有化
    private String name;
    private String gender;
    private double salary;
    private double height;
    //定义构造器

        //无参构造器

    public Exercise01() {

    }


    //有参构造器


    //构造器内直接使用 set 方法控制输入参数
    public Exercise01(String name,String gender,double salary,double height) {

        //this.name = name;
        //this.gender = gender;
        //this.salary = salary;
        //this.height = height;

        setName(name);
        setGender(gender);
        setSalary(salary);
        setHeight(height);

    }



    //定义方法

        //定义get和set方法
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 100 && height < 300) {
            this.height = height;
        } else {
            this.height = 180;
        }

    }
}
