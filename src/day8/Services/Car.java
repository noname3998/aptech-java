package day8.Services;

public class Car extends Vehicle {
    private int amountOfSeat;
    private String engine;

    public Car(int vehicleNumber, String manufacturer, int yearOfManufacturer, String vehicleColor, int amountOfSeat,
            String engine) {
        super(vehicleNumber, manufacturer, yearOfManufacturer, vehicleColor);
        this.amountOfSeat = amountOfSeat;
        this.engine = engine;
    }

    public Car() {

    }

    public int getAmountOfSeat() {
        return amountOfSeat;
    }

    public void setAmountOfSeat(int amountOfSeat) {
        this.amountOfSeat = amountOfSeat;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void addVehicle() {
        super.addVehicle();
        System.out.println("nhap so cho ngoi:");
        amountOfSeat = sc.nextInt();
        sc.nextLine();
        System.out.println("nhap kieu dong co:");
        engine = sc.nextLine();

        vehicles.add(this);
    }

    @Override
    public String toString() {
        return super.toString() + " | So cho ngoi: " + amountOfSeat + " | Loai dong co: " + engine;
    }
}
