package org.example;

public class Phone {
    String name;
    String color;
    int ram;

    public void call(){
        System.out.println("Take a caller from "+name);
    }

    public void browseInternet(){
        System.out.println("brows internet");
    }

    public static void main(String[] args) {

        Phone phone1 =new Phone();
        phone1.name = "samsung";
        phone1.color ="red";
        phone1.call();


        Phone phone2 = new Phone();
        phone2.name="apple";
        phone2.call();

        System.out.println(phone1.color);

    }
}
