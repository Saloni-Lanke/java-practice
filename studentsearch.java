public class StudentSearch {

    public static void main(String[] args) {

        String[] students = {"Saloni", "Rahul", "Anjali", "Amit"};

        String search = "Anjali";

        for (String student : students) {

            if (student.equals(search)) {
                System.out.println("Student Found");
                break;
            }

        }

    }
}
