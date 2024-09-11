public class User {
    public int userId;
    public String name;
    // Other User attributes
    public String driverLicense;
    public Location location;

    public User(int userId, String name, String driverLicense) {
        this.userId = userId;
        this.name = name;
        this.driverLicense = driverLicense;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    
}
