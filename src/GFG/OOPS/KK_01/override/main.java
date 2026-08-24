package GFG.OOPS.KK_01.override;

public class main {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car,bike,boat};
        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }
    }
}
