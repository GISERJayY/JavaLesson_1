package com.javaLeson_1.operator;

public class Demo8 {
     //三元运算符
     public static void main(String[] args) {
         // x? y : z
         //如果x==true，则结果是y 否则结果为z
         int score = 50;
         String type = score<60? "不及格" : "及格";
         System.out.println(type);

     }
}
