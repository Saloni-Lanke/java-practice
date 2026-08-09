class Student {

    int rollNo;
    String name;

    Student(int rollNo, String name) {

        this.rollNo = rollNo;
        this.name = name;

    }

    void display() {

        System.out.println(rollNo + " - " + name);

    }
}

public class StudentObjectArray {

    public static void main(String[] args) {

        Student[] students = new Student[3];

        students[0] = new Student(1, "Saloni");
        students[1] = new Student(2, "Rahul");
        students[2] = new Student(3, "Anjali");

        for (Student s : students) {
            s.display();
        }

    }
}
