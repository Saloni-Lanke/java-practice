class Employee {

    int id;
    String name;

    Employee(int id, String name) {

        this.id = id;
        this.name = name;

    }

    void display() {

        System.out.println(id + " - " + name);

    }

}

public class EmployeeArray {

    public static void main(String[] args) {

        Employee[] employees = new Employee[3];

        employees[0] = new Employee(1, "Saloni");
        employees[1] = new Employee(2, "Rahul");
        employees[2] = new Employee(3, "Anjali");

        for (Employee e : employees) {

            e.display();

        }

    }

}
