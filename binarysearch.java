public class BinarySearch {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int search = 40;
        int low = 0;
        int high = numbers.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (numbers[mid] == search) {
                found = true;
                break;
            } else if (numbers[mid] < search) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

        if (found)
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");

    }

}
