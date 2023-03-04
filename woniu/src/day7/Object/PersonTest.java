package day7.Object;

public class PersonTest {
    public static void main(String[] args) {
        Person zhanSan = new Person();
        zhanSan.name = "张三";
        zhanSan.gender = "男";
        zhanSan.age = 19;
        zhanSan.height = 188.2;
        zhanSan.salary = 1600;
        zhanSan.say();
        Integer[] test = {1,5,10,4,8,6};
        Integer[] newTest = zhanSan.sortArray(test,false);
        for (int i = 0; i < newTest.length ; i++) {
            System.out.println(newTest[i]);
        }

        Person liShi = new Person("李四","女",22,165.7,1500);
        liShi.say();
        Integer[] arr = {2,8,19,4,10};
        Integer [] newArr = liShi.sortArray(arr,true);
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}
