package krmu;

import java.util.Scanner;

class Student {
    String name;
    String rollNo;
    String course;
    double marks;
    String grade;

    Scanner sc = new Scanner(System.in);

    public void inputStudentData() {
        System.out.println("Enter your name:");
        name = sc.nextLine();

        System.out.println("Enter your roll no:");
        rollNo = sc.nextLine();

        System.out.println("Enter your course:");
        course = sc.nextLine();

        System.out.println("Enter your marks:");
        marks = sc.nextDouble();
        sc.nextLine(); // ✅ Corrected here

        calculateGrade();
    }

    public void calculateGrade() {
        if (marks >= 90) {
            grade = "A+";
        } else if (marks >= 80) {
            grade = "A";
        } else if (marks >= 70) {
            grade = "B";
        } else if (marks >= 60) {
            grade = "C";
        } else if (marks >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
    }

    public void displayStudentData() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        System.out.println("--------------");
    }
}

class StudentManagementSystem {
    Student[] students;
    int studentCount;
    Scanner sc = new Scanner(System.in);

    public void initializeSystem(int size) {
        students = new Student[size]; // ✅ Fixed (size instead of Size)
        studentCount = 0;
    }

    public void addStudent() {
        if (studentCount >= students.length) {
            System.out.println("Can't add more students. Limit reached!");
            return; // ✅ Prevent adding beyond array size
        }
        Student s = new Student();
        s.inputStudentData();
        students[studentCount] = s;
        studentCount++;
        System.out.println("krmu.Student added successfully.");
    }

    public void displayAllStudents() {
        if (studentCount == 0) {
            System.out.println("No student data available.");
            return;
        }
        System.out.println("======== krmu.Student Records ========");
        for (int i = 0; i < studentCount; i++) {
            students[i].displayStudentData();
        }
    }
}

public class Student_managementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();

        System.out.println("Enter the max number of students:");
        int size = sc.nextInt();
        sc.nextLine();
        sms.initializeSystem(size);

        int choice;
        do {
            System.out.println("\n===== krmu.Student Record Management System ========");
            System.out.println("1. Add krmu.Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    sms.addStudent();
                    break;
                case 2:
                    sms.displayAllStudents();
                    break;
                case 3:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 3);

        sc.close();
    }
}
