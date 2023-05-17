package com.javaLeson_1.operator;

public class Demo4 {
    public static void main(String[] args) {
        int a = 3;
        int b = a++;//执行完这行代码后，先给b赋值，再自增
        System.out.println(a);// a=a+1
        int c = ++a;//执行完这行代码前，先自增，再给c赋值。
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        //幂运算 2^3 = 2*2*2 = 8
        double pow = Math.pow(2, 3);//很多 运算，我们会用一些工具类进行运算操作
        System.out.println(pow);

    }
}
