package com.javaLeson_1.operator;

public class Demo5 {
    public static void main(String[] args) {
        //与（and），或（or），非（取反）
        boolean a = true;
        boolean d = false;
        System.out.println("a||b:"+(a||d));//逻辑或与运算，两个变量有一个为真，结果为真
        System.out.println("a&&b:"+(a&&d));//逻辑与运算，两个变量都为真，结果为真
        System.out.println("!(a&&b):"+!(a&&d));//如果是真则假，假则真
        //短路运算
        int c = 3;
        boolean b = (c<4)&&(c++<4);//先赋值，再计算
        System.out.println(b);
        System.out.println(c);
    }
}
