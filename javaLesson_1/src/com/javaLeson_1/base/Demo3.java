package com.javaLeson_1.base;

public class Demo3 {
    public static void main(String[] args) {
        int i = 128;
        double b = i ;
        //强制转换      （类型）变量名  高到低
        //自动转换    低到高
        System.out.println(i);
        System.out.println(b);
        /*
        注意点：
              1、不能对布尔值进行转换
              2、不能把对象类型转换为不相干的类型。
              3、在把高容量转为低容量的时候强制转换。
              3、转换的时候可能存在溢出，或精度问题！
         */
        System.out.println("==============================");
        System.out.println((int)35.7);
        System.out.println((int)-51.8);
        System.out.println("=============================");
        char c = 'a';
        int d = c +1;
        System.out.println(d);
        System.out.println((char)d);
    }
}
