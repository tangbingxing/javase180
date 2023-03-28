package org.infoManage.service;

import org.infoManage.dao.StudentDao;
import org.infoManage.info.StudentInfo;

public class StudentService {

    StudentDao studentDao = new StudentDao();

    public void addStudent(StudentInfo student) {
        studentDao.addStudent(student);
    }

    public void deleteStudent(int deleteId) {
        int index = studentDao.IdToIndex(deleteId);
        if(index != -1) {
            studentDao.deleteStudent(index);
        }
    }

    public void updateStudent(int updateId,StudentInfo student) {
        int index = studentDao.IdToIndex(updateId);
        if(index != -1){
            studentDao.updateStudent(index,student);
        }
    }

    public void showAllStudent() {
        studentDao.showAllStudent();
    }

    public boolean idExit(int Id) {
        boolean res =false;
        int index = studentDao.IdToIndex(Id);
        if(index != -1) {
            res = true;
        }
        return res;
    }
}
