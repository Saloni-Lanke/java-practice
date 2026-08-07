class Circle {

    double radius = 7;

    double area() {

        return 3.14 * radius * radius;

    }

}

public class CircleExample {

    public static void main(String[] args) {

        Circle c = new Circle();

        System.out.println("Area = " + c.area());

    }

}
