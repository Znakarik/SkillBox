package core;

public class Camera1 {
    public static Car1 getNextCar() {
        String randomNumber = Double.toString(Math.random()).substring(2, 5);
        int randomHeight = (int) (1000 + 3500. * Math.random());
        double randomWeight = 600 + 10000 * Math.random();

        Car1 car1 = new Car1();
        car1.number = randomNumber;
        car1.height = randomHeight;
        car1.weight = randomWeight;
        car1.hasVehicle = Math.random() > 0.5;
        car1.isSpecial = Math.random() < 0.15;

        return car1;
    }
}