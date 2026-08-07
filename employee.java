class Employee {

    int id;
    String name;

    Employee(int id, String name) {

        this.id = id;
        this.name = name;

    }

    void display() {

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);

    }

}

public class EmployeeExample {

    public static void main(String[] args) {

        Employee emp = new Employee(101, "Saloni");

        emp.display();

    }

}
