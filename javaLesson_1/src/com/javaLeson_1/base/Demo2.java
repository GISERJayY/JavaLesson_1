package com.javaLeson_1.base;

public class Demo2 {
    public static void main(String[] args) {
        //整数拓展：进字   二进字0b  十进制  八进字0  十六进字0x
        int i1 = 10;
        int i4 = 0b1;
        int i2 = 010;
        int i3 = 0x10;

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println("===============================================");
        //========================================================
         //浮点数拓展？银行业务这样表示？钱
        //BigDecmal 数学工具类
        //=======================================================
        //float 有序的 离散的 舍入误差 大约 接近但不等于
        //double
        //最好完全避免使用浮点数进行比较
        float a = 0.1f;//0.1
        double b = 1.0/10;//0.1
        System.out.println(b==a);//false

        float c = 12323242444f;
        float d = c + 1;
        System.out.println(c==d);//true
        //========================================================
        //字符串的拓展
        //=======================================================
        System.out.println("===============================================");
        char c1 = 'c';
        char c2 = '中';
        System.out.println(c1);
        System.out.println((int)c1);//强制转换
        System.out.println(c2);
        System.out.println((int)c2);//强制转换
        //所有字符本质都是数字
        //编码 Unicode表：97=a，65=A） 2字节 0-65536 excel最长 2的16次方 = 65536
        // U0000 - UFFFF
        char c3 = '\u0061';
        System.out.println(c3);

        //转译字符
        // \t 制表符
        // \n 换行
        System.out.println("=======================================");
        String sa = new String("com.javaLeson_1.base.hello_world");
        String sb = new String("com.javaLeson_1.base.hello_world");
        System.out.println(sa==sb);
        String sc = "com.javaLeson_1.base.hello_world";
        String sd = "com.javaLeson_1.base.hello_world";
        System.out.println(sc==sd);
        //内存 从对象分析
        boolean flag = true;
        if(flag){}//老手
        if(flag==true){} //新手
        //less is more！代码要精简易读。


    }
}
