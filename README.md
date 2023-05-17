#  目录

1. 注释、标识符、关键字  
2. 数据类型 
3. 数据转换
4. 变量、常量
5. 运算符
6. 包机制、JavaDoc

# 1 注释、标识符、关键字

## 注释

- 平时我们编写代码，在代码量比较少的时候，我还可以看懂自己写的代码，但是当项目结构一旦复杂起来，我们就需要注释了。
- 注释并不会被执行，是写给我们写代码人看的
- **书写注释是一个非常好的习惯**
- **平时写代码一定要注意规范**

----

- java中的注释有三种：
  - 单行注释  //......
  - 多行注释 /*..... */
  - 文旦注释（javadoc）//** + 回车  

## 标识符

- 关键字

| abstract   |    assert    |  boolean  |   break    |  byte  |
| ---------- | :----------: | :-------: | :--------: | :----: |
| case       |    catch     |   char    |    cass    | const  |
| continue   |   default    |    do     |   double   |  else  |
| enum       |   extends    |   final   |   float    |  for   |
| for        |     goto     |    if     | implements | imort  |
| instanceof |     int      | interface |    long    | native |
| new        |   package    |  private  | protected  | public |
| return     |   strictfp   |   short   |   static   | super  |
| switch     | synchronized |   this    |   throw    | throws |
| transient  |     try      |   void    |  volatile  | while  |

- java所以的组成部分需要的名字、类名、变量名以及方法名都被称为标识符。

-----

## 标识符注意点

- 所有的标识符都应该以字母（A-Z或a-z），美元符$，或者下划线(_)开始。
- 首字母之后可以是字母（A-Z或a-z），美元符$，或者下划线(_)或数字的任何字符组合。
- 不能用关键字作为变量或方法名。
- 标识符是大小写敏感的。
- 合法标识符举例：age、$salary、_ value _、1_value
- 非法标识符举例：123abc、-salary、#abc
- 可以使用中文命名，但是一般不建议这样去使用，也不建议使用拼音，很low   

_____

# 2 数据类型

- 强类型语言
  -  要求变量的使用要严格符合规定，所有变量必须先定义以后才能使用。
- 弱类型语言
- java的数据类型分为两大类
  - 基本类型（primitive type）
  - 引用类型（reference type）

![截图](https://github.com/GISERJayY/JavaLesson_1/blob/main/%E5%9B%BE%E7%89%87/%E6%95%B0%E6%8D%AE%E7%B1%BB%E5%9E%8B.png?raw=true)

- 什么是字节

  - 位（bit）：是计算机内部数据存储的最小单位，11001100是一个八位二进制数。
  - 字节（byte）：是计算机中数据处理的基本单位，习惯上用大写B来标识。
  - 字符：是指计算机中使用的字母、数字、字和符号。
  - 1bit表示一位。
  - 1Byte表示一个字节1B=8b
  - 1024B = 1KB
  - 1024KB = 1M
  - 1024M = 1G   
  
  -----
  
# 3 数据转换

- 由于java是强类型语言，所以要进行有些运算的时候，需要用类型转换。

```
低 --------------------------> 高
byte,short,char -> int -> long -> float -> double
//小数的优先级大于整数
```

- 运算中，不同类型的数据先转换为同一类型，然后进行运算。
- 强制类型转换
- 自动类型转换

---

# 4变量

- 变量是什么，就是可以变化的量！
- java是一种强类型语言，每个变量都必须声明其类型。
- java变量是程序中最基本的存储单元，其要素包括变量名，变量类型和**作用域**。  

```
type varName [=value][,varName[=value]]:
//数据类型 变量名 = 值：可以使用逗号隔开来声明多个同类型变量。
```

- 注意事项
  - 每个变量都有类型，类型可以是基本类型，也可以是引用类型。
  - 变量名必须是合法的标识符
  - 变量名是一条完整的语句，因此每一个声明都必须分号结束。

## 变量作用域

- 类变量
- 实例变量
- 局部变量

```java
public class Variable{
  static int allclicks = 0;//类变量
  String str = "hello world";//实例变量
  public void method(){
    int i = 0;//局部变量
  }
}
```



## 常量

- 常量(Constant)：初始化(initialize)后不能再改变值！不会变动的值。
- 所谓常量可以理解成一种特殊的变量，它的值被设定后，在程序运行过程中不允许被改变。

```java
final 常量名 = 值；
final double PI = 3.14
```

- 常量名一般用大写字符。

 ## 变量的命名规范

- 所有变量、方法、类名：见名知章。
- 类成员变量：首字母小写和驼峰原则：monthSalary
- 局部变量：首字母小写和驼峰原则
- 常量：大写字母和下滑线：MAX_VALUE
- 类名：首字母大写和驼峰原则：Man，GoodMan
- 方法名：首字母小写和驼峰原则：run(),runRun()

# 5运算符

- java语言支持如下运算符：运算符号优先级( )--**家庭作业**

  - 算术运算符：+，-，*，/，%，++，--
  - 赋值运算符 = 
  - 关系运算符：>，<，>=，<=，==，!=instanceof
  - 逻辑运算符：&&，||，!
  - 位运算符：&，|，^，~，>>，<<，>>>（了解！！！）
  - 条件运算符 ?:
  - 扩展运算符：+=，-=，*=，/=

# 6包机制

- 为了更好地组织类，java提供了包机制，用于区别类名的命名空间。
- 包语句的语法格式为：

```java
package pkg1[.pkg2[.pkg3_]];
package com.yangjie.xxxx;
package com.liwan.xxx;
// ctrl + 鼠标右键可以看包文件夹
// 拆分文件夹包名在一起 文件内容栏右上角⚙️ tree appearan --> 去勾选 compact middle package
```

- 一般利用公司域名作为包名；
- 为了能够使用某一个包的成员，我们要在java程序中明确导入该包。使用“import”语句可完成此功能。

```java
import pkg1.pkg2.*  //同配符号
```

# 7Java Doc

- javadoc命令是用来生成自己API文档的
- 参数信息
  - @author 作者名
  - @version 版本号
  - @since 指明需要最早使用的jdk版本
  - @param参数名
  - @return返回值情况
  - @throw异常抛情况
