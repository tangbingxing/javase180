package infoManger.service;

//业务处理类
//进行逻辑业务处理，数据处理和返回需要找库管Dao类

import infoManger.dao.StudentDao;
import infoManger.info.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    //成员属性
    StudentDao studentDao = new StudentDao();
    private Scanner sc = new Scanner(System.in);

    //成员方法

    //成员方法start 显示开始界面
    public void start() {

    }


    //成员方法addStudent  添加学生
    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    //根据传入的Id，查找是否存在相同的Id，存在则返回true，不存在则返回false;
    public boolean findId(String Id) {
        boolean res = false;

        return res;
    }

    //返回所有的学生对象
    public ArrayList findAllStudent() {
        //找Dao类
        ArrayList<Student> students = studentDao.findAllStudent();
        return students;
    }

    //删除指定Id学生的信息
    public boolean deleteStudentById(String deleteId) {

        //若存在，则交给Dao类删除，若不存在，则返回false
        boolean res = false;
        //判断Id是否存在
        if (studentDao.findId(deleteId)) {
            studentDao.deleteStudentById(deleteId);
            res = true;
        }
        return res;
    }

    //修改指定Id学生的信息
    public void updateStudent(String updateId, Student student) {
        studentDao.updateStudentById(updateId,student);
    }

    //校验方法
    //年龄范围在1-100之间
    //Id需要唯一
}
