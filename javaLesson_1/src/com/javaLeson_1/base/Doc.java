package com.javaLeson_1.base;

/**
 * @author  yangjie
 * @version 1.0
 * @since 1.8
 */
public class Doc {
    String name;
    /**
     *
     * @param name
     * @return
     * @throws Exception
     */
    public String test(String name) throws Exception{
        return name;
    }
    //通过命令行生成javadoc  终端代码 javadoc -encoding UTF-8 -charset UTF-8 Doc.java
    //作业 用IDEA生产javadoc
}
