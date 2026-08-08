class Interest {

    double calculate(double principal, double rate, double time) {

        return (principal * rate * time) / 100;

    }

}

public class SimpleInterest {

    public static void main(String[] args) {

        Interest obj = new Interest();

        double result = obj.calculate(10000, 5, 2);

        System.out.println("Simple Interest = " + result);

    }

}
