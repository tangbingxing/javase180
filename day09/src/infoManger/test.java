package infoManger;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        //集合的添加

        str.add("a");
        str.add("b");
        //集合的获取
        System.out.println(str.get(0));
        System.out.println(str.get(1));
        for (String s : str) {
            System.out.println("s = " + s);
        }
        //String [] strs;
        //
        //strs = str.toArray();
        //
        int [] a = {10,12,14};
        //System.out.println(a.toString());
        for (int i : a) {
            System.out.println(i);
        }
    }
}
