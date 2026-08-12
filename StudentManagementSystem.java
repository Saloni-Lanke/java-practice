import java.util.ArrayList;
import java.util.Scanner;

class Student {

    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {

        this.id = id;
        this.name = name;
        this.marks = marks;

    }

    void display() {

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);

    }

}

public class StudentManagementSystem {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Student Management System =====");

        System.out.println("1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {

            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();

            Student s = new Student(id, name, marks);

            students.add(s);

            System.out.println("Student Added Successfully!");

        }

        else if (choice == 2) {

            System.out.println("\nStudent Details:");

            for (Student s : students) {

                s.display();

            }

        }

        else if (choice == 3) {

            System.out.println("Thank you!");

        }

        else {

            System.out.println("Invalid Choice!");

        }

    }

}
