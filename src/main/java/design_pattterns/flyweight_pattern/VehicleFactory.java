package design_pattterns.flyweight_pattern;

import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {
    private static final Map<Color, Vehicle> vehicleCache = new HashMap<>();

    public static Vehicle createVehicle(Color color){
        return vehicleCache.computeIfAbsent(color, uncachedColor -> new Car(uncachedColor, new Engine()));
    }
}
