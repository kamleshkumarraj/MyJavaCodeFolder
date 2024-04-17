package JAVA;

import java.util.Scanner;
class ram{
    static void print(){
        System.out.println("Hello World ! ");
     }
    }
class staticvar{
    static int a=0;
    void count(){
        a++;
        System.out.println(a);
    }
}

public class staticClass {
    // static{
    //     int a=9;
    //     int b=9;
    //     Scanner sc = new Scanner(System.in);
    //     int sum = a+b;
    //     System.out.println("Sum = "+sum);
    // }
    // // public static void main(String[] args) {
        
    // }
     int a=10;

    public static void main(String[] args) {
        staticClass k = new staticClass();
        System.out.println(k.a); 
        ram.print();
        staticvar obj = new staticvar();
        staticvar obj1 = new staticvar();
        staticvar obj2 = new staticvar();
        staticvar obj3 = new staticvar();
        obj.count();
        obj1.count();
        obj2.count();

    }
}
