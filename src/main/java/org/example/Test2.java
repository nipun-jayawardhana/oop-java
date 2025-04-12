package org.example;

public class Test2 {

    static String name1;
    static String name2;
    static String name3;

    static void call1(){
        System.out.println("calling name 1 like: "+name1);
    }
    static void call2(){
        System.out.println("calling name 2 like:"+name2);
    }
    static void call3(){
        System.out.println("calling name 3 like:"+name3);
    }

    public static void main(String[]args){
        name1="samsung";
        name2="apple";
        name3="googlepixel";

        call1();

    }



}

