public class SelectionSort {

    public static void main(String[] args) {

        int[] numbers = {29, 10, 14, 37, 13};

        for (int i = 0; i < numbers.length - 1; i++) {

            int min = i;

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[j] < numbers[min]) {
                    min = j;
                }

            }

            int temp = numbers[min];
            numbers[min] = numbers[i];
            numbers[i] = temp;

        }

        for (int i = 0; i < numbers.length; i++) {

            System.out.println(numbers[i]);

        }

    }

}
