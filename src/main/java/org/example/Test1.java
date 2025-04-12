package org.example;

public class Test1 {
    int x;
    static int y;

    void meth1(){

        }

        static void meth2(){

        }

        public static void main(String[] args){

        //meth1()--- will be error because this is non static method
         meth2();

         Test1 obj =new Test1();   //so non static method calling like this
         obj.x=4;
         obj.meth1();


        }


}
