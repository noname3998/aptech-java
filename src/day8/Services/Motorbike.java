package day8.Services;

public class Motorbike extends Vehicle {
    private String capicity;

    public Motorbike(int vehicleNumber, String manufacturer, int yearOfManufacturer, String vehicleColor,
            String capicity) {
        super(vehicleNumber, manufacturer, yearOfManufacturer, vehicleColor);
        this.capicity = capicity;
    }

    public Motorbike() {

    }

    public String getCapicity() {
        return capicity;
    }

    public void setCapicity(String capicity) {
        this.capicity = capicity;
    }

    @Override
    public void addVehicle() {
        super.addVehicle();
        System.out.println("nhap cong suat:");
        capicity = sc.nextLine();

        vehicles.add(this);
    }

    @Override
    public String toString() {
        return super.toString() + " | Cong suat: " + capicity;
    }
}
