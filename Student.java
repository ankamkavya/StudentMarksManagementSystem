
// Student.java
public class Student {
    String name;
    int rollNo;
    int[] marks = new int[3];
    int total;
    float average;
    char grade;

    public void calculate() {
        total = 0;
        for (int mark : marks) {
            total += mark;
        }
        average = total / 3.0f;

        if (average >= 90) grade = 'A';
        else if (average >= 75) grade = 'B';
        else if (average >= 60) grade = 'C';
        else if (average >= 40) grade = 'D';
        else grade = 'F';
    }

    public void display() {
        System.out.println("Student Report:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(" Subject " + (i+1) + ": " + marks[i]);
        }
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}
