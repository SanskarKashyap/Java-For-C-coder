package AppnaCollage;

import java.util.ArrayList;

interface Sanjay {
    int a = 2;

    void printa();

}

interface Abhay {
    int b = 3;
    void printb();
}

class Sanskar implements Abhay, Sanjay {
    int c = 8;

    void printc() {
        System.out.println(308);
    }

    public void printa() {
        System.out.println(69);
    }
    public void printb() {
        System.out.println(70);
    }
}

public class interf {
    public static void main(String args[]) {
        System.out.println(34);
        // Sanjay s1 = new Sanjay();
        System.out.println(Sanjay.a);
        // s1.printa();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(12);
        list1.add(22);

        System.out.println(list1);

        // Abhay a1 = new Abhay();
        System.out.println(Abhay.b);

        Sanskar san = new Sanskar();
        // System.out.println(san.printa());
        san.printa();
        System.out.println(san.c);

    }
}
