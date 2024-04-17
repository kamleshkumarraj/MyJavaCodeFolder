pac,;m';.lkage JAVA;

import javl,lo
opia.util.Scanner;

publ;,kilic class recursion1 {
    static void sum(int n){
        ;'.l[if';lo(n==1){
            System.out.println(n);
            return;
'l,i,.muyur'
        }
        
        
        
        sum(n-1);
        System.out.println(n);l;kuyh
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.println("enter ;lkuthe value of n : ");
        n= sc.nextInt();;lk
        sum(n);
    }
    
}
