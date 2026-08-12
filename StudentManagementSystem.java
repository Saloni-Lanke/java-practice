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

    }
}
