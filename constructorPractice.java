package JAVA;
class pintu{
    String name ;
    int age ;
    int rollno;
    pintu(String name , int age , int rollno ){
        this.name =name ;
        this.age = age;
        this.rollno= rollno;

    }
    static void print(pintu k){
        System.out.println(k.name);
        System.out.println(k.age);
        System.out.println(k.rollno);
    }
}

public  class constructorPractice {
    private String name;
   private  int salary;
   private constructorPractice(String name , int salary){
        this.name=name;
        this.salary = salary;

    }
    private constructorPractice(constructorPractice emp){
        name=emp.name;
        salary=emp.salary+20000;
    }
    static void  print(constructorPractice emp1){
        System.out.println(emp1.name);
        System.out.println(emp1.salary);
    }

    public static void main(String[] args) {
        //we are using default constructor;
        //we are using parametaraized constructor
        //we are using copy constructor
        // we are using private constuctor In private constructor we can not access the data on other class
        //in private constructor is constructor is only applicable for self class 
        constructorPractice emp1 = new constructorPractice("kamlesh",20000);
        constructorPractice emp2 = new constructorPractice(emp1);
        pintu s1 = new pintu("Alok",34,19);
        print(emp1);
        print(emp2);
        pintu.print(s1);

    }
}
