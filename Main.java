import java.util.Scanner;

class StudentGradesSystem {

    void studentDetails() {

        String name;
        long rollNumber;
        byte javaMarks, pythonMarks, cMarks;
        short total;
        float percentage;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name:");
        name = sc.next();

        System.out.println("Enter your roll number:");
        rollNumber = sc.nextLong();

        System.out.println("Enter marks of Java:");
        javaMarks = sc.nextByte();

        System.out.println("Enter marks of Python:");
        pythonMarks = sc.nextByte();

        System.out.println("Enter marks of C:");
        cMarks = sc.nextByte();

        total = (short) (javaMarks + pythonMarks + cMarks);
        percentage = (float) total / 3;

        System.out.println("\n----- Student Details -----");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);

        sc.close();
    }
}

public class Main {

    public static void main(String[] args) {

        StudentGradesSystem obj = new StudentGradesSystem();

        obj.studentDetails();
    }
}
