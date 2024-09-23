public class Car {
    private String make;
    private String model;
    private int speed;

    // Getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    // Setters
    public void setMake(String theMake) {
        make = theMake;
    }

    public void setModel(String theModel) {
        model = theModel;
    }

    public void setSpeed(int theSpeed) {
        speed = theSpeed;
    }

    // Methods
    public static double convertSpeedToMPH(int speedInKmh) {
        return speedInKmh * 0.621371;
    }

    public void displayInfo() {
        System.out.println("==== CAR INFORMATION WITH KMH ====");
        System.out.println("Make: " + make + "\nModel: " + model + "\nSpeed: " + speed + " kmh");
    }


}
