import java.util.List;

public class Store {
    public int storeId;
    public InventoryManagement inventoryManagement;
    public Location location;
    public List<Reservation> reservations;
    public int getStoreId() {
        return storeId;
    }
    public InventoryManagement getInventoryManagement() {
        return inventoryManagement;
    }
    public Location getLocation() {
        return location;
    }
    public List<Reservation> getReservations() {
        return reservations;
    }
    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }
    public void setInventoryManagement(InventoryManagement inventoryManagement) {
        this.inventoryManagement = inventoryManagement;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    

}
