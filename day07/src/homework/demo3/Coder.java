package homework.demo3;

//定义程序员类Coder。属性：姓名name，工号id，工资salary。行为：工作work()

public class Coder {
    //定义成员属性
    private String name;
    private int id;
    private double salary;
    //定义成员方法
    public void work() {
        System.out.println("工号为" + id + "基本工资为" + salary + "的程序员正在努力的写着代码......");
    }

    //构造器

    public Coder() {
    }

    public Coder(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }


    //getter setter方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
