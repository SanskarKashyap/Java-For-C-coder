package AppnaCollage;

class Shape {
    public void area() {
        System.out.println("Printing Area");
    }

}

class Trangle extends Shape {
    public void area(int a) {
        System.out.println(a * a);
    }
}

public class inhert {
    public static void main(String arg[]) {
        Trangle t = new Trangle();
        t.area(4);
    }

}
