class Car {

    String brand;
    int price;

    Car(String brand, int price) {

        this.brand = brand;
        this.price = price;

    }

    void display() {

        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);

    }

}

public class CarExample {

    public static void main(String[] args) {

        Car c = new Car("Toyota", 500000);

        c.display();

    }

}
