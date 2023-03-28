package org.gui;

import javax.swing.*;

public class JFswing {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

        jFrame.setTitle("用户登录");

        jFrame.setSize(400,300);

        jFrame.setDefaultCloseOperation(3);

        jFrame.setAlwaysOnTop(true);

        jFrame.setLayout(null);

        //设置文本
        JLabel jLabel1 = new JLabel("用户名");
        JLabel jLabel2 = new JLabel("密码");

        jLabel1.setBounds(50,50,50,20);
        jLabel2.setBounds(50,100,50,20);

        //设置文本框
        JTextField jTextField1 = new JTextField();
        JPasswordField jTextField2 = new JPasswordField();
        jTextField1.setBounds(150,50,180,20);
        jTextField2.setBounds(150,100,180,20);

        //设置按钮
        JButton jButton = new JButton("登录");

        jButton.setBounds(50,200,280,20);

        jFrame.add(jButton);
        jFrame.add(jLabel1);
        jFrame.add(jLabel2);
        jFrame.add(jTextField1);
        jFrame.add(jTextField2);

        jFrame.setVisible(true);


    }
}
