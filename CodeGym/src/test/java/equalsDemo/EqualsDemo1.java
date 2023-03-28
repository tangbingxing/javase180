package test.java.equalsDemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
* 输入两个名字，并对比他们的内容和长度，如果内容相同则输出“名字相同”，如果名字不同，但长度相同则显示“名字长度相同”
* */
public class EqualsDemo1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();

        if (name1.equals(name2)) {
            System.out.println("名字相同");
        } else if (name1.length() == name2.length()) {
            System.out.println("名字长度相同");
        }
    }
}
