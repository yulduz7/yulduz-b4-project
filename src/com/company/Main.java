package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("This is Yulduz's project");
        System.out.println(revStr("Hello World"));
    }

    public static String revStr(String str) {
        return new StringBuilder(str).reverse().toString();
    }

}
