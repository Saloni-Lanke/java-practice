class Calculator {

    int add(int a, int b) {

        return a + b;

    }

    int subtract(int a, int b) {

        return a - b;

    }

}

public class CalculatorUsingMethods {

    public static void main(String[] args) {

        Calculator cal = new Calculator();

        System.out.println("Addition = " + cal.add(20, 10));

        System.out.println("Subtraction = " + cal.subtract(20, 10));

    }

}
