package infoManger.control;

//服务员，呈现同用户交互的页面，用户发送的业务请求传送到Service层进行业务处理
// 管理类，负责呈现交互页面的业务逻辑

import infoManger.dao.StudentDao;
import infoManger.info.Student;
import infoManger.service.StudentService;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    //成员属性

    StudentService studentService = new StudentService();


    private Scanner sc = new Scanner(System.in);
    //成员方法
    //开始界面
    public void start() {
        loop:while (true) {
            //欢迎界面
            System.out.println("Welcome to the Student Management System");
            //选择界面
            System.out.println("Please enter your choice:\r" +
                    "1.add 2.view 3.delete 4.update 5.exit");
            //用户输入
            int key = sc.nextInt();
            //根据用户输入进入不同路线
            switch (key) {
                case 1:
                    //添加学生
                    addStudent();
                    break;
                case 2:
                    //查看全部学生信息
                    findAllStudent();
                    break;
                case 3:
                    //删除指定Id学生信息
                    deleteStudent();
                    break;
                case 4:
                    //修改指定Id学生信息
                    updateStudent();
                    break;
                case 5:
                    //退出   直到用户选择退出才回到主界面，否则一直在当前页面循坏
//                    exit();  //用return语句退出
                    break loop;   //用break退出
                default:
                    System.out.println("Your input is incorrect, please re-enter it");
                    break;
            }
        }
    }

    private void exit() {
        System.out.println("Are you sure?(Y/N)");
        String res = sc.next();
        //判断用户是否真的退出
        if("y".equals(res)){
            return;
        }
    }

    private void updateStudent() {
        System.out.println("Please enter update student Id");
        String updateId = sc.next();
        //如果Id存在，则继续进行修改
        if (!studentService.findId(updateId)) {
            System.out.println("Please enter update student name");
            String name = sc.next();
            System.out.println("Please enter update student age");
            String age = sc.next();
            System.out.println("Please enter update student birthday");
            String birthday = sc.next();
            //将用户输入的信息封装成新的学生对象
            Student student = new Student();
            student.setName(name);
            student.setAge(age);
            student.setBirthday(birthday);
            //传给Service类
            studentService.updateStudent(updateId,student);
            System.out.println("Update Student Successful");

        } else {
            System.out.println("Id not exist");
        }
        //如果Id不存在，则提示错误信息，并返回选择页面
    }

    private void deleteStudent() {
        System.out.println("Please enter delete student Id");
        String deleteId = sc.next();
        //如果Id存在，则删除
        //如果Id不存在，则提示错误信息，并返回选择页面
        if(studentService.findId(deleteId)) {
            studentService.deleteStudentById(deleteId);
            System.out.println("Delete Successful");
        } else {
            System.out.println("Id not exist");
        }
    }

    private void findAllStudent() {
        System.out.println("Show All Student Info");
        System.out.println("ID\t" + "name\t" + "age\t" + "birthday");
//        用集合接收，并单独输出
        ArrayList allStudent = studentService.findAllStudent();
        //遍历集合
        System.out.println();
    }

    private void addStudent() {
        while (true) {
            System.out.println("Please add student");
            System.out.println("enter Id");
            String Id = sc.next();
            //判断Id是否存在，不存在继续进行下一步，存在则死循坏
            if(studentService.findId(Id)) {
                continue;
            }
            System.out.println("enter name");
            String name = sc.next();
            System.out.println("enter age");
            String age = sc.next();
            System.out.println("enter birthday");
            String birthday = sc.next();
            break;
        }
    }
}
