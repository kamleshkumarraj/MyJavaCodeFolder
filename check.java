package JAVA;
interface pk{
    String name="Kamlesh Kumar";
    int age=20;
    void add();
    static void details(){
        System.out.println("My name is : "+name);
        System.out.println("My age is : "+age);
    }


    public static void main(String[] args) {
        details();
    }
}
class server implements pk{
    public void add(){
        int a= 90 , b=89;
        int sum = a+b;
        System.out.println("Sum = "+sum);
    }

}
public class check{
    public static void main(String[] args) {
        pk obj = new server();
        obj.add();
        int sum = 18/3*(4-3+5);
        System.out.println("Result = "+sum);

    }
}
