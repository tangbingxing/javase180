package org.infoManage.control;

//这里是管理类，负责和用户交互

import org.infoManage.info.StudentInfo;
import org.infoManage.service.StudentService;

import java.util.Scanner;

import static javafx.application.Platform.exit;

public class StudentControl {
    Scanner sc = new Scanner(System.in);
    boolean key = true;
    StudentService studentService = new StudentService();

    public void start() {
        while (key) {
            System.out.println("Welcome To Student Info Manage System");
            System.out.println("Choice Operation");
            System.out.println("1.Add Student");
            System.out.println("2.Delete Student");
            System.out.println("3.Update Student");
            System.out.println("4.Show All Student");
            System.out.println("5.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    deleteStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    showAllStudent();
                    break;
                case 5:
                    //exit();
                    key = false;
                    break;
            }
        }
    }

    private void showAllStudent() {
        studentService.showAllStudent();
    }


    private void updateStudent() {
        while (true) {
            System.out.println("Enter Update Id");
            int updateId = sc.nextInt();
            if (studentService.idExit(updateId)) {
                System.out.println("Enter name");
                String name = sc.next();
                System.out.println("Enter age");
                int age = sc.nextInt();
                System.out.println("Enter gender");
                String gender = sc.next();//scanner中没有直接接收char的方法，只能间接获取
                StudentInfo student = new StudentInfo();
                student.setId(updateId);
                student.setName(name);
                student.setAge(age);
                student.setGender(gender);
                studentService.updateStudent(updateId,student);
                break;
            } else {
                System.out.println("Id not Exit,Please enter again");
            }
        }
    }

    private void deleteStudent() {
        while (true) {
            System.out.println("Enter Delete Id");
            int deleteId = sc.nextInt();
            if (studentService.idExit(deleteId)) {
                studentService.deleteStudent(deleteId);
                break;
            } else {
                System.out.println("Id not Exit,Please enter again");
            }
        }
    }

    private void addStudent() {
        while (true) {
            System.out.println("Enter Id");
            int Id = sc.nextInt();
            if (!studentService.idExit(Id)) {
                System.out.println("Enter name");
                String name = sc.next();
                System.out.println("Enter age");
                int age = sc.nextInt();
                System.out.println("Enter gender");
                String gender = sc.next();

                StudentInfo student = new StudentInfo();
                student.setId(Id);
                student.setName(name);
                student.setAge(age);
                student.setGender(gender);

                studentService.addStudent(student);
                break;
            } else {
                System.out.println("Id is Exit,Please enter again");
            }
        }
    }
}
