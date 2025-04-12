package org.example;

public class Test3 {
    String name;

    void call(){
        System.out.println("choose a phone as: "+name);
    }

    public static void main(String[]args){

        Test3 phone1= new Test3();
        Test3 phone2= new Test3();
        Test3 phone3= new Test3();

        phone1.name="samsung";
        phone2.name="apple";
        phone3.name="google pixel";

        phone1.call();
        phone2.call();
        phone3.call();

    }
}
