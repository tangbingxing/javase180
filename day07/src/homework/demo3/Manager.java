package homework.demo3;
/*
定义项目经理类Manager。
属性：姓名name，工号id，工资salary，奖金bonus。行为：工作work()
 */

public class Manager {
    //定义成员属性
    private String name;
    private int id;
    private double salary;
    private double bonus;

    //定义成员方法
    public void work() {
        System.out.println("工号为" + id + "基本工资为" + salary + "奖金为" + bonus + "的项目经理正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
    }

    //构造器

    public Manager() {
    }

    public Manager(String name, int id, double salary, double bonus) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
    }


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

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
