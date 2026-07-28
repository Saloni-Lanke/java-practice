public class FinallyBlock {

    public static void main(String[] args) {

        try {

            int result = 20 / 2;
            System.out.println(result);

        } catch (Exception e) {

            System.out.println("Error");

        } finally {

            System.out.println("Finally block always executes.");

        }

    }

}
