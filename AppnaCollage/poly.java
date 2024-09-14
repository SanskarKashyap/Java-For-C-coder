package AppnaCollage;
// Polymorphism is a compile time process , it there is an error it will be noticed during copile time only

class Student11 {
    int roll;
    String Name ; 
   
    
    public void printInfo()
    {
        System.out.println("Student Roll : "+ roll);
    }

    public void printInfo(String Name)
    {
        System.out.println("S Name :"+Name+ "S Roll :"+roll);
    }

}

public class poly {
    public static void main(String arg[]) {
        Student11 s = new Student11();
        s.Name = "San";
        s.roll = 35;
        s.printInfo();
        s.printInfo(s.Name);
    }
}
