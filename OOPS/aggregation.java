package OOPS;

class Mutiplayer {
    void start() {
        System.out.println("kk starts");
    }
}

class Car {
    Mutiplayer multiMutiplayer;  // Aggregation (reference only)

    Car(Mutiplayer m) {
        this.multiMutiplayer = m;
    }

    void drive() {
        multiMutiplayer.start();
        System.out.println("Car drives");
    }
}

public class aggregation {
    public static void main(String[] args) {
        Mutiplayer mp = new Mutiplayer(); // ✅ Created outside
        Car myCar = new Car(mp);          // ✅ Injected into Car
        myCar.drive();
    }
}
