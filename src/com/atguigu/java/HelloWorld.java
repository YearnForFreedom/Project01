package com.atguigu.java;

import java.util.Arrays;
import java.util.List;

/*

 */
public class HelloWorld {
    public static void main(String[]args){
        System.out.println("hello world");

        String[] arr=new String[]{"Tom","Jerry","HanMeimei","Lilei"};
        List<String> strings = Arrays.asList(arr);
        for (String string : strings) {
            System.out.println("string = " + string);
        }

    }
}
