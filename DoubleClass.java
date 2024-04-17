package JAVA;
class Outer{
   String rollno;
   String name;
   String Id;
    Outer(String rollno , String name , String Id){
        this.rollno = rollno;
        this.name = name;
        this.Id = Id;

    }
    void show(){
        System.out.println("My Name Is : "+name);
        System.out.println("My Id Is : "+Id);
        System.out.println("My roll number Is : "+rollno);
    }
    class details{
        String village;
        String postOffice;
        details(String village , String postOffice){
            this.village = village;
            this.postOffice = postOffice;
        }
       void show(){
            System.out.println("My Village IS : "+village);
            System.out.println("My Post Office Is : "+postOffice);
        }

    }

}
public class DoubleClass {
    public static void main(String[] args) {
        Outer obj = new Outer("90","Kamlesh Kumar" , "T22EJICS067");
        //for accessing the inner class we create the object of inner class likeas,
        obj.show();
        Outer.details obj1 = obj.new details("Theng Pur", "Bahdin Pur");
        obj1.show();



    }
}
