import java.util.*;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("You entered: " + num);

        sc.nextLine();

        // String input
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println ("You entered: " + str);

        //while,
        int i = 0;
        while (i < 5) {
            System.out.print(i+ " ");
            i++;
        }

        System.out.println();

        //for loop
        for (int j = 10; j < 15; j++) {
            System.out.print(j + " ");
        }
        
        System.out.println();
        //do-while loop
        int j = 25;
        do {
            System.out.print(j + " ");
            j++;
        } while (j < 30);

        //close the scanner
        sc.close();

        // break and continue
        //if, else, if-else statements all are are same as C++

    }
}