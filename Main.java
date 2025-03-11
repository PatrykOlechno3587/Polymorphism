public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        Boat boat = new Boat();
        Bicycle bicycle = new Bicycle();

        Vehicle[] racers = {car, bicycle,boat};
        car.honk();
        bicycle.honk();
        boat.honk();
    }
}
