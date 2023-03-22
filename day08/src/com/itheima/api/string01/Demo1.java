package com.itheima.api.string01;

/*
* 首先，从登录界面上可以得出，需要让用户输入登录名和密码
	2.设计一个登录方法，对用户名和密码进行校验
	3.调用登录方法，根据方法的返回结果，判断登录是否成功。
	4.如果登录失败，循环登录3次，结束循环；如果登录成功，跳出循环;
* */

public class Demo1 {
    //登录名  密码
    private String name;
    private String password;

    //构造器

    public Demo1(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public Demo1() {
    }


    //方法

    public boolean cheek() {
        boolean a = false;
        boolean b = false;

        return a & b;
    }

    //getter 和 setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
