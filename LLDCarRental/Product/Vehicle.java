package Product;

public class Vehicle {
    public int id;
    public String name;
    // Other vehicle attributes

    public VehicleType type;
    public VehicleStatus status;
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public VehicleType getType() {
        return type;
    }
    public VehicleStatus getStatus() {
        return status;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setType(VehicleType type) {
        this.type = type;
    }
    public void setStatus(VehicleStatus staus) {
        this.status = staus;
    }

    
}
