package com.company;


public class Main {

    public static void main(String[] args) {

        MyBigInteger val = new MyBigInteger("110");
        val.multiply(new MyBigInteger("11"));
        System.out.println(val.getValue());

    }
}
