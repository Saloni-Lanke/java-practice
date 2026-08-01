class Table {

    synchronized void printTable(int n) {

        for (int i = 1; i <= 5; i++) {

            System.out.println(n * i);

        }

    }

}

public class Synchronization {

    public static void main(String[] args) {

        Table obj = new Table();

        obj.printTable(5);

    }

}
