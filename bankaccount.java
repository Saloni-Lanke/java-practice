class BankAccount {

    double balance = 1000;

    void deposit(double amount) {

        balance += amount;

    }

    void display() {

        System.out.println("Balance: " + balance);

    }

}

public class BankAccountExample {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.deposit(500);

        account.display();

    }

}
