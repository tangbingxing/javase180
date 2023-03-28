package org.infoManage.dao;

//这是仓库类，负责对数据的操作

import org.infoManage.info.StudentInfo;

import java.util.ArrayList;

public class StudentDao {
    private static ArrayList<StudentInfo> students = new ArrayList<>();

    {
        StudentInfo student1 = new StudentInfo(1,"Tom",12,"男");
        StudentInfo student2 = new StudentInfo(2,"Cacy",10,"女");
        students.add(student1);
        students.add(student2);
    };

    public void addStudent(StudentInfo student) {
        students.add(student);
    }

    public void deleteStudent(int index) {
        students.remove(index);

    }

    public void updateStudent(int index,StudentInfo student) {
        students.set(index,student);
    }

    public void showAllStudent() {
        for (StudentInfo student : students) {
            System.out.println(student);
        }
    }

    //根据Id返回索引
    public int IdToIndex(int Id) {
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            int id = students.get(i).getId();
            if (id == Id) {
                index = i;
            }
        }
        return index;
    }

}
