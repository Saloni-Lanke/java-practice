public class NumberFrequency {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 10, 30, 10, 40};

        int search = 10;
        int count = 0;

        for (int number : numbers) {

            if (number == search) {
                count++;
            }

        }

        System.out.println("Frequency = " + count);

    }
}
