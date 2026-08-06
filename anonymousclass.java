interface Animal {

    void sound();

}

public class AnonymousClass {

    public static void main(String[] args) {

        Animal obj = new Animal() {

            public void sound() {

                System.out.println("Dog barks");

            }

        };

        obj.sound();

    }

}
