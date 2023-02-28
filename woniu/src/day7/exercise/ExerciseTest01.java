package day7.exercise;

public class ExerciseTest01 {
    //主方法
    public static void main(String[] args) {
        //新建一个对象
        Exercise01 ex = new Exercise01("姓名","性别",5999.9,64);
        System.out.println("ex.getName() = " + ex.getName());
        System.out.println("ex.getGender() = " + ex.getGender());
        System.out.println("ex.getHeight() = " + ex.getHeight());

    }
}
