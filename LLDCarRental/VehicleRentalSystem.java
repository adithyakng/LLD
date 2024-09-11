import java.util.List;

public class VehicleRentalSystem {
    List<Store> stores;
    List<User> users;

    VehicleRentalSystem(List<Store> stores, List<User> users) {
        this.stores = stores;
        this.users = users;
    }

    public List<Store> getStoresByLocation(Location location) {
        return stores;
    }
}
