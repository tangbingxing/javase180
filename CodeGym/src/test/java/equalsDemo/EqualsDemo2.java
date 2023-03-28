package test.java.equalsDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EqualsDemo2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());

        if ( age < 18 ) {
            System.out.println("再长大一点");
        }
    }
}
