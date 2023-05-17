package com.javaLeson_1.base;

public class Demo4 {
    public static void main(String[] args) {
        //操作比较大的数字，注意溢出
        //jdk7新特性，数字之间可以用下划线
        int money = 10_0000_0000;
        System.out.println(money  );
        int year = 20;
        int toal = money * year; //-1474836480 计算的时候溢出
        System.out.println(toal);
        long toal1 = money * year; //默认是int转换前以成问题
        System.out.println(toal1);
        long toal2 = (long)money * year; //先把一个数转为long
        System.out.println(toal2);
    }
}
