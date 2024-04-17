package JAVA;

import java.util.Scanner;

public class Class1 {
    static int a=0;
     Class1(){
        a++;
        System.out.println(a);
    }
    public static void main(String[] args) {
        System.out.println("Hii My name is Kamlesh Raj Kushwaha");
        // class1 obj = new class1();
        // class1 obj1 = new class1();
        // class1 obj2= new class1();
        // class1 obj3 = new class1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a = ");
        int a = sc.nextInt();
        System.out.println("Enter b = ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum = "+sum);
        // double a1 = sc.nextDouble();
        // double a2 = sc.nextDouble();
        System.out.println("Enter a1 = ");
        float a1 = sc.nextFloat();
        System.out.println("Enter b1 = ");
        float b1 = sc.nextFloat();
        float sum1 = a1+b1;
        System.out.println("Sum  = "+sum1);
        
    }
}
