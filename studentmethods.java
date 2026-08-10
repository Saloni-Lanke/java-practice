class Student {

    String name;
    int marks;

    Student(String name, int marks) {

        this.name = name;
        this.marks = marks;

    }

    void display() {

        System.out.println("Name = " + name);
        System.out.println("Marks = " + marks);

    }

    boolean isPassed() {

        return marks >= 40;

    }
}

public class StudentMethods {

    public static void main(String[] args) {

        Student s = new Student("Saloni", 85);

        s.display();

        System.out.println("Passed = " + s.isPassed());

    }
}
