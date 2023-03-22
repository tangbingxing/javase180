package infoManger;

import infoManger.dao.StudentDao;
import infoManger.info.Student;

public class test {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();
        Student student = new Student("12","Tom","18","03-19");
        Student student2 = new Student("15","Jack","18","03-19");
        Student student3 = new Student("15","Jan","20","03-19");
        studentDao.addStudent(student);
        studentDao.addStudent(student2);
        studentDao.findAllStudent();
        studentDao.updateStudentById("12",student3);
        studentDao.deleteStudentById("15");
        studentDao.findAllStudent();
    }
}
