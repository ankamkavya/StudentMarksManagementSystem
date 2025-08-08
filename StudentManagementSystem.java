
// StudentManagementSystem.java
import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.print("Enter Student Name: ");
        s.name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        s.rollNo = sc.nextInt();

        System.out.println("Enter marks for 3 subjects:");
        for (int i = 0; i < 3; i++) {
            System.out.print(" Subject " + (i+1) + ": ");
            s.marks[i] = sc.nextInt();
        }

        s.calculate();
        s.display();

        sc.close();
    }
}
