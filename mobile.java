class Mobile {

    String brand;
    int price;

    Mobile(String brand, int price) {

        this.brand = brand;
        this.price = price;

    }

    void display() {

        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);

    }

}

public class MobileExample {

    public static void main(String[] args) {

        Mobile m = new Mobile("Samsung", 25000);

        m.display();

    }

}
