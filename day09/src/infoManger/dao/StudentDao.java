package infoManger.dao;

//仓库类，对学生信息进行存储和增删改查操作

import infoManger.info.Student;

import java.util.ArrayList;

public class StudentDao {
    //创建成员属性，用集合来存储所有的学生对象信息
    private ArrayList<Student> students = new ArrayList<>();

    //成员方法addStudent:添加学生信息
    public void addStudent(Student stu) {
    //将传入的学生信息封装到集合里
        students.add(stu);
    }

    //成员方法findAllStudent:查看学生信息
    public ArrayList findAllStudent() {
        return students;
    }

    //成员方法deleteStudentById:删除学生信息,传入要删除的学生Id,返回布尔值（也可不返回）
    public void deleteStudentById(String Id) {

    //判断是存在该Id的学生
        for (Student student : students) {
            //删除集合中指定Id的学生信息
            students.remove(student);
        }
    }

    //成员方法updateStudent:更改学生信息，传入要更改的学生Id,返回布尔值（也可不返回）
    public void updateStudentById(String Id,Student student) {
        int index = -1;
        //判断学生是否存在
        for (int i = 0; i < students.size(); i++) {
            Student stu = students.get(i);
            if(stu.getId().equals(Id)) {
                index = i;
            }
        }
        if (index != -1) {
            //集合索引，修改内容
            students.set(index,student);
            //修改成功
            System.out.println("Update Student Successful");
        } else {
            //修改失败
            System.out.println("Update Student False");
        }
    }
}
