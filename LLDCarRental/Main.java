import java.util.ArrayList;
import java.util.List;
import Product.*;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        List<Store> stores = new ArrayList<>();

        handleUsers(users);
        handleStores(stores);

        VehicleRentalSystem vehicleRentalSystem = new VehicleRentalSystem(stores, users);

        // Step 1: A user comes to pick up a vehicle
        User user = users.get(0);

        // Step 2: The user selects a store filterByLocation
        Store store = vehicleRentalSystem.getStoresByLocation(user.getLocation()).get(0);

        // Step 3: Get all vehicles the store has filter by user choic
        List<Vehicle> vehicles = store.getInventoryManagement().getVehicles(VehicleType.CAR);

        // Step 4: The user selects a vehicle and creates a reservation
        Reservation reservation = new Reservation();
        reservation.setUser(user);
        reservation.setVehicle(vehicles.get(0));
        reservation.setPickLocation(store.getLocation());

        // Step 5: The store confirms the reservation
        store.reservations.add(reservation);

        // Step 6: Based on the reservation, create a Invoice
        Invoice invoice = new Invoice();
        invoice.setReservation(reservation);
        
        // Step 7: User Pays the Invoice
        Payment pay = new Payment();
        pay.pay(reservation);

        // Step 8: The user returns the vehicle
        reservation.endReservation();

    }

    public static void handleUsers(List<User> users) {
        User user = new User(1, "Adithya", "1234567890");
        users.add(user);
    }

    public static void handleStores(List<Store> stores) {
        // Create some vehicles
        Vehicle v1 = new Car();
        Vehicle v2 = new Car();

        v1.setId(1);
        v1.setType(VehicleType.CAR);
        v1.setStatus(VehicleStatus.AVAILABLE);

        v2.setId(2);
        v2.setType(VehicleType.CAR);
        v2.setStatus(VehicleStatus.AVAILABLE);

        // Create Inventory Management
        InventoryManagement inventoryManagement = new InventoryManagement(List.of(v1, v2));

        // Create Store
        Store store = new Store();
        store.setInventoryManagement(inventoryManagement);
        stores.add(store);
    }
}
