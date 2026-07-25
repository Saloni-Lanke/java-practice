public class ArrayFrequency {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 2, 4, 2};

        int search = 2;
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == search) {
                count++;
            }

        }

        System.out.println("Frequency = " + count);

    }

}
