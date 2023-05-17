package com.javaLeson_1.base;

public class Demo5 {
        //类变量 static、
        static  int slary = 1000;

        //实例变量：从属于对象；如果不自行出始化，这类型的默认值为 0 0.0
        //布尔值：默认是false
        //除了基本类型，其余默认值为null;
        String name;
        int age;
        char sex;
        //main方法
        public static void main(String[] args) {
            //局部变量：必须声明初始化值
            int i = 10;
            //变量类型 变量名字 = new com.javaLeson_1.base.Demo();
            System.out.println(i);
            Demo5 demo5 = new Demo5();
            System.out.println(demo5.sex);
            System.out.println(demo5.age);
            System.out.println(demo5.name);
            //类变量
            System.out.println(slary);

        }
    }


