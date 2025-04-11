abstract class Vehicle {
    abstract void start();
}

interface Machine {
    void stop();
}

class Car extends Vehicle implements Machine {
    void start() {
        System.out.println("Car starts");
    }
    public void stop() {
        System.out.println("Car stops");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.stop();
    }
}