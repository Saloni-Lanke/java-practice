class StudentResult {

    int marks1;
    int marks2;
    int marks3;

    StudentResult(int marks1, int marks2, int marks3) {

        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;

    }

    void displayResult() {

        int total = marks1 + marks2 + marks3;

        double percentage = total / 3.0;

        System.out.println("Total = " + total);
        System.out.println("Percentage = " + percentage);

    }

}

public class StudentResultExample {

    public static void main(String[] args) {

        StudentResult s = new StudentResult(80, 75, 90);

        s.displayResult();

    }

}
