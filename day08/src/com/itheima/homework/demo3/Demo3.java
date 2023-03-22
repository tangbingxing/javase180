package com.itheima.homework.demo3;

//在如下商品 Java入门, 宁夏枸杞, 黑枸杞, 人字拖, 特级枸杞, 枸杞子 中，批量删除枸杞

import java.util.ArrayList;

public class Demo3 {
    public static void main(String[] args) {
        //用ArrayList存储商品
        ArrayList<String> list = new ArrayList<>();
        list.add("Java入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("特级枸杞");
        list.add("枸杞子");
        ////遍历商品   方法一
        //for (int i = 0; i < list.size(); i++) {
        //    //获取每个商品
        //    String goods = list.get(i);
        //    //判断商品中是否包含枸杞，是的话则从集合中删除
        //    if (goods.contains("枸杞")) {
        //        list.remove(i);
        //        i--;
        //    }
        //}

        //方法二
        for (int i = list.size() - 1; i >= 0; i--) {
            String goods = list.get(i);
            if (goods.contains("枸杞")) {
                list.remove(i);
            }
        }
        System.out.println(list);

    }
}
