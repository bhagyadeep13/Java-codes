package OOPS;
class Engine {
    void start() {
        System.out.println("Engine starts");
    }
}

class Car {
    Engine engine = new Engine();  // Composition -- create object in another class

    void drive() {
        engine.start();  // Delegating behavior to Engine
        System.out.println("Car drives");
    }
}

public class compostion {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drive();
    }
}
