package JAVA;

import java.util.Scanner;

public  class add {
    public static class fraction{
        int  a;
        int  b;

         fraction(int a, int b){
            this.a=a;
            this.b=b;  
         }    
    }
    static int  hcf(int p, int q){
        int i=p,k=0;
        for(i=p; i>=0; i--){
            if(p%i==0 && q%i==0){
                k=i;
                break;
            }
        }
        return k;
    
    }
    static void  simplyfy(int p, int q){
       int k=hcf(p,q);
        p=p/k;
        q=q/k;
        System.out.print("With  sum="+p+"/"+q);
        
    }
    static fraction add1(fraction f1, fraction f2, fraction f3){
        
        f3.a=f1.a*f2.b+f2.a*f1.b;
        f3.b=f1.b*f2.b;

        return f3;
        
    }
    
    
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1,b1,a2,b2;
        System.out.println("enter the value of a1 : ");
        a1=sc.nextInt();
        System.out.println("enter the value of b1 : ");
        b1=sc.nextInt();
        System.out.println("enter the value of a2 : ");
        a2=sc.nextInt();
        System.out.println("enter the value of b2 : ");
        b2=sc.nextInt();
        fraction f1 = new fraction(a1,b1);
        fraction f2 = new fraction(a2,b2);
        fraction f3 =new fraction(0,0);
        int p,q;
        add1(f1,f2,f3);
        p=f3.a;
        q=f3.b;
        simplyfy(p, q);
        
        




    }
    }
    

