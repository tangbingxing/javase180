package com.itheima.homemorks;
        /*
        红茶妹妹有21元钱，她攒了几天钱之后自己的钱比原来的两倍还多三块。
        绿茶妹妹有24元钱，她攒了几天钱之后自己的钱正好是原来的两倍。
        那么红茶和绿茶现在的钱一样多，请问对么？
        */

public class Demo10 {
    public static void main(String[] args) {
        int blackTea = 21;
        int greenTea = 24;
        String res = blackTea*2+3 == greenTea*2 ? "对":"不对";
        System.out.println("res = " + res);
    }
}
