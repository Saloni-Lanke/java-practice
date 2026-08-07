class Student {

    int rollNo;
    String name;

    Student(int rollNo, String name) {

        this.rollNo = rollNo;
        this.name = name;

    }

    void display() {

        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);

    }

}

public class StudentExample {

    public static void main(String[] args) {

        Student s1 = new Student(1, "Saloni");

        s1.display();

    }

}
