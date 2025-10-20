package day9.Services;

public class DepartmentHeads extends Employee {
    private double trachNhiem;

    public DepartmentHeads(String idNumber, String name, int salary, double trachNhiem) {
        super(idNumber, name, salary);
        this.trachNhiem = trachNhiem;
    }

    public DepartmentHeads() {
    }

    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + trachNhiem;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Thuong trach nhiem: " + trachNhiem + "\n" + "Luong thuc linh: "
                + String.format("%.0f", this.getSalary());
    }

    @Override
    public void addEmployee() {
        super.addEmployee();
        System.out.println("nhap luong trach nhiem: ");
        trachNhiem = sc.nextDouble();
        employees.add(this);
    }
}
