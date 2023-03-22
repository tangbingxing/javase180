package com.itheima.homework.demo7;

//"Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的"。请编写程序，统计该文本中"Java"一词出现的次数。

public class Demo {
    public static void main(String[] args) {
        String text = "Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的";
        String find = "Java";
        /*int numCount = 0;
        //判断字符串第一次出现的索引位置
        while (true) {
            int index = text.indexOf(find);  //若没有，则 index 为-1
            //截取字符串，从索引开始到字符串的结尾
            if (index == -1) {
                break;
            } else {
                int begin = find.length() + index;
                //截取文本
                text = text.substring(begin);
                //System.out.println(text);
                numCount++;
            }
        }
        System.out.println("该文本中" + find + "一词出现的次数是" + numCount + "次");*/

        for (int i = 0; i < text.length(); i++) {
            String substring = text.substring(i, i + 4);

        }
    }
}
