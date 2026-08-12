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

        int choice;

        do {

            System.out.println("\n===== Student Management System =====");

            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

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

                System.out.print("Enter Student ID to Search: ");
                int searchId = sc.nextInt();

                boolean found = false;

                for (Student s : students) {

                    if (s.id == searchId) {

                        System.out.println("\nStudent Found:");

                        s.display();

                        found = true;

                        break;

                    }

                }

                if (!found) {

                    System.out.println("Student Not Found!");

                }

            }

            else if (choice == 4) {

                System.out.println("Thank you!");

            }

            else {

                System.out.println("Invalid Choice!");

            }

        } while (choice != 4);

        sc.close();

    }

}
