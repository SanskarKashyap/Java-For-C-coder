import java.util.*;

public class noPointer 
{
    public static void fun() {
        System.out.println("Hello from Fun");
    }

    static int a = 123;
    static int b = 456;

    public void swap() {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) 
    {
        fun();
        System.out.println("A: " + a + " B: " + b);
        // swap();
        System.out.println("a: " + a + " b: " + b);
    }
}
