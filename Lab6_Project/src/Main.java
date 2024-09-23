public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.setMake("Toyota");
        car1.setModel("Corolla");
        car1.setSpeed(180);

        Car car2 = new Car();
        car2.setMake("Honda");
        car2.setModel("Civic");
        car2.setSpeed(200);

        System.out.println("CAR 1");
        car1.displayInfo();

        System.out.println("\nCAR 2");
        car2.displayInfo();

        System.out.println("\n==== CAR1 - INFO WITH MPH ====");
        System.out.println("Make: " + car1.getMake());
        System.out.println("Model: " + car1.getModel());
        System.out.printf("Speed: %.2f mph%n", Car.convertSpeedToMPH(car1.getSpeed()));

        System.out.println("\n==== CAR2 - INFO WITH MPH ====");
        System.out.println("Make: " + car2.getMake());
        System.out.println("Model: " + car2.getModel());
        System.out.printf("Speed: %.2f mph%n", Car.convertSpeedToMPH(car2.getSpeed()));
    }
}
