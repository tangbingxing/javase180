package homework.demo5;

import java.util.ArrayList;
import java.util.Scanner;

public class MoviesOption {
    //存储电影信息
    private ArrayList<Movies> movieList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private int key;

    //显示操作界面
    public void menu() {
        while (true) {
            System.out.println("---电影信息管理系统------");
            System.out.println("1.添加电影信息");
            System.out.println("2.通过电影ID查找信息");
            System.out.println("3.显示所有电影信息");
            System.out.println("4.退出");
            System.out.print("请根据序号选择功能（1-4）:");
            key = sc.nextInt();
            switch (key) {
                case 1:
                    add();
                    break;
                case 2:
                    searchById();
                    break;
                case 3:
                    show();
                    break;
                case 4:
                    return;
            }
        }
    }


    //添加电影信息
    public void add() {
        //创建对象
        Movies movies = new Movies();
        //为对象赋值
        System.out.print("请输入电影ID");
        int ID = sc.nextInt();
        movies.setID(ID);
        System.out.print("请输入电影名称");
        String name = sc.next();
        movies.setName(name);
        System.out.print("请输入电影价格");
        double price = sc.nextDouble();
        movies.setPrice(price);

        //将对象存储到集合中
        movieList.add(movies);

    }

    //根据ID查询电影信息
    public void searchById() {
        System.out.println("请输入要查找的电影ID");
        int ID = sc.nextInt();
        for (int i = 0; i < movieList.size(); i++) {
            Movies movies = movieList.get(i);
            if (movies.getID() == ID) {
                System.out.println("电影ID: " + movies.getID() + "\t");
                System.out.println("电影名称: " + movies.getName() + "\t");
                System.out.println("电影价格: " + movies.getPrice() + "\t");
            } else {
                System.out.println("未找到你输入ID的电影信息，请检查是否输入有误: ");
            }
        }
    }

    //显示所有电影信息
    public void show() {
        System.out.println();

        for (int i = 0; i < movieList.size(); i++) {
            Movies movies = movieList.get(i);
            System.out.print("电影ID: " + movies.getID() + "\t");
            System.out.print("电影名称: " + movies.getName() + "\t");
            System.out.print("电影价格: " + movies.getPrice() + "\n");
        }
    }
}
