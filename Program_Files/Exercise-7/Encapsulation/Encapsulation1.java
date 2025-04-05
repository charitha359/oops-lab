class Car {
    private int speed;

    public int getSpeed() {
        return speed;
    }
    public void accelerate(int increment) {
        if (increment > 0) {
            speed += increment;
            System.out.println("Car accelerated. Speed: " + speed + " km/h");
        } else {
            System.out.println("Invalid acceleration value.");
        }
    }
    public void brake(int decrement) {
        if (decrement > 0 && decrement <= speed) {
            speed -= decrement;
            System.out.println("Car slowed down. Speed: " + speed + " km/h");
        } else {
            System.out.println("Invalid brake value.");
        }
    }
}

public class Encapsulation1 {
    public static void main(String[] args) {
        Car c = new Car();
        c.accelerate(50);
        c.brake(20);
        System.out.println("Final Speed: " + c.getSpeed() + " km/h");
    }
}