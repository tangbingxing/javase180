package infoManger.entry;

//程序入口类

import infoManger.control.StudentController;
import infoManger.control.TeacherController;
import infoManger.service.StudentService;
import infoManger.service.TeacherService;

import java.util.Scanner;

public class SystemEntry {
    //主方法
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            //显示欢迎界面
            System.out.println("Welcome to the Information Management System");
            //显示选择界面
            System.out.println("Please enter your choice:\r" +
                    "1.Student management 2.Teacher management 3.Exit\r");
            //用户进行选择
            int key = sc.nextInt();
            //判断用户的选择，并决定不同的路线
            switch (key) {
                case 1:
                    //进入学生管理程序
                    //创建学生服务类
                    StudentController studentController = new StudentController();
                    //调用start方法，显示菜单
                    studentController.start();
                    break;
                case 2:
                    //进入老师管理程序
                    TeacherController teacherController = new TeacherController();
                    break;
                case 3:
                    //提供退出按钮，当用户决定退出时才结束程序，否则一直保持在选择界面
                    System.out.println("Thank you for using it");
                    return;
                default:
                    //若用户输入错误信息，进行报错提示
                    System.out.println("Your input is incorrect, please re-enter it");
                    break;
            }
        }
    }
}
