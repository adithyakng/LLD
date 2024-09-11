import Product.Vehicle;
import Product.VehicleType;

import java.util.*;

public class InventoryManagement {
    List<Vehicle> vehicles;

    public InventoryManagement(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public List<Vehicle> getVehicles(VehicleType type) {
        return vehicles;
    }

}
