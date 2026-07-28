public class ThrowsKeyword {

    static void checkAge(int age) throws Exception {

        if (age < 18) {

            throw new Exception("Not Eligible");

        }

        System.out.println("Eligible");

    }

    public static void main(String[] args) {

        try {

            checkAge(16);

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

}
