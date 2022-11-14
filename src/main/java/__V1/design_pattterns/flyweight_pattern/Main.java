package __V1.design_pattterns.flyweight_pattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.createVehicle(Color.GREEN);
        vehicle.getEngine().setColor(Color.BLACK);
        vehicle.getEngine().setManufacturer("Toyota");
        vehicle.getEngine().setWeight(76.3);


        System.out.println(vehicle.toString());

        Vehicle anotherVehicle = VehicleFactory.createVehicle(Color.GREEN);
        anotherVehicle.getEngine().setWeight(100.1);
        System.out.println(anotherVehicle);
    }
}
