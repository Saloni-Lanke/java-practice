class Rectangle {

    int length;
    int width;

    Rectangle(int length, int width) {

        this.length = length;
        this.width = width;

    }

    int area() {

        return length * width;

    }

}

public class RectangleExample {

    public static void main(String[] args) {

        Rectangle r = new Rectangle(10, 5);

        System.out.println("Area = " + r.area());

    }

}
