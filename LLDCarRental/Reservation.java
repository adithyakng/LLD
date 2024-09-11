import Product.Vehicle;

public class Reservation {

    int reservationId;
    User user;
    Vehicle vehicle;
    ReservationStatus status;
    Location pickLocation;
    Location dropLocation;
    // Other Reservation attributes
    public int getReservationId() {
        return reservationId;
    }
    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public ReservationStatus getStatus() {
        return status;
    }
    public void setStatus(ReservationStatus status) {
        this.status = status;
    }
    public Location getPickLocation() {
        return pickLocation;
    }
    public void setPickLocation(Location pickLocation) {
        this.pickLocation = pickLocation;
    }
    public Location getDropLocation() {
        return dropLocation;
    }
    public void setDropLocation(Location dropLocation) {
        this.dropLocation = dropLocation;
    }

    public void endReservation(){
        this.status = ReservationStatus.COMPLETED;
    }
    
    
}
