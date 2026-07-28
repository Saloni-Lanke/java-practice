public class ThrowExample {

    public static void main(String[] args) {

        try {

            throw new ArithmeticException("Custom Error");

        } catch (ArithmeticException e) {

            System.out.println(e.getMessage());

        }

    }

}
