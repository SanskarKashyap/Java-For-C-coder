package AppnaCollage;

import java.util.LinkedList;

// Student class to store roll number and total marks
class Studentk {
    int rollNo;
    int totalMarks;

    // Constructor to initialize student details
    public Studentk(int rollNo, int totalMarks) {
        this.rollNo = rollNo;
        this.totalMarks = totalMarks;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll No: " + rollNo + ", Total Marks: " + totalMarks);
    }
}

public class StudentLinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList to store Student objects
        LinkedList<Studentk> studentList = new LinkedList<>();

        // Add student details to the LinkedList
        studentList.add(new Studentk(101, 85));
        studentList.add(new Studentk(102, 90));
        studentList.add(new Studentk(103, 75));

        // Display student details from the LinkedList
        System.out.println("Student Details:");
        for (Studentk student : studentList) {
            student.displayDetails();
        }

        // Reverse the LinkedList of students and display again
        reverseLinkedList(studentList);

        System.out.println("\nReversed Student Details:");
        for (Studentk student : studentList) {
            student.displayDetails();
        }
    }

    // Method to reverse the LinkedList
    public static void reverseLinkedList(LinkedList<Studentk> list) {
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            Studentk temp = list.get(i);
            list.set(i, list.get(size - 1 - i));
            list.set(size - 1 - i, temp);
        }
    }
}

