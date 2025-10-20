package day8.Services;

public class Truck extends Vehicle {
    private String payload;

    public Truck(int vehicleNumber, String manufacturer, int yearOfManufacturer, String vehicleColor, String payload) {
        super(vehicleNumber, manufacturer, yearOfManufacturer, vehicleColor);
        this.payload = payload;
    }

    public Truck() {

    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    @Override
    public void addVehicle() {
        super.addVehicle();
        System.out.println("nhap tai trong:");
        payload = sc.nextLine();

        vehicles.add(this);
    }

    @Override
    public String toString() {
        return super.toString() + " | Tai trong: " + payload;
    }

}
