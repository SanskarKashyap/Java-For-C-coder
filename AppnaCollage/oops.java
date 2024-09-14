package AppnaCollage;

class Pen{
    int price;
    String colour;

    String type;

    public void Write() {
        // system.print.out("Writting something");
        System.out.println("Write Something");
    }

    public void printProperty(){
        System.out.println(this.colour);
    }
}

class Student
{   
    int roll; 
    String name ; 
    Student()
    {
        System.out.println("This is Default constructor");
    }
    Student(int a , String s)
    {
        this.roll=a;
        this.name= s ; 

    }
    public void printInfo()
    {
        System.out.println(this.roll+" "+this.name);
    }
    

}

public class oops {
    public static void main(String arg[])
    {
        Pen pen1 = new Pen();
        pen1.colour="blue" ;
        pen1.price=40;
        pen1.type="ball-pen";

        pen1.Write();
        pen1.printProperty();

        Student S1 = new Student();
        S1.roll=308;
        Student S2 = new Student(3 , "Sanskar");
        S2.printInfo();

    }
}
