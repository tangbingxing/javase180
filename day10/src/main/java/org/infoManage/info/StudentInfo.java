package org.infoManage.info;

//这里是学生信息

public class StudentInfo {

    private int Id;
    private String name;

    private int age;

    private String gender;

    public StudentInfo() {
    }

    public StudentInfo(int id, String name, int age, String gender) {
        Id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentInfo\t" +
                "StudentId=" + Id +
                ", Student name= " + name +
                ", Student age= " + age +
                ", Student gender= " + gender ;
    }
}
