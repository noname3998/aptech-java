package day9.Services;

public class MarketingStaff extends Employee {
    private double doanhSo;
    private double hoaHong;

    public MarketingStaff(String idNumber, String name, int salary, double doanhSo, double hoaHong) {
        super(idNumber, name, salary);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    public MarketingStaff() {

    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHoaHong() {
        return hoaHong;
    }

    public void setHoaHong(double hoaHong) {
        this.hoaHong = hoaHong;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + (super.getSalary() * (doanhSo + hoaHong) / 100);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Doanh so(%): " + String.format("%.2f", doanhSo) + "\n" + "Hoa hong(%): "
                + String.format("%.0f", hoaHong) + "\n"
                + "Luong thuc linh: " + String.format("%.0f", this.getSalary());
    }

    @Override
    public void addEmployee() {
        super.addEmployee();
        System.out.println("nhap doanh so(%): ");
        doanhSo = sc.nextDouble();
        System.out.println("nhap hoa hong(%): ");
        hoaHong = sc.nextDouble();

        employees.add(this);

    }
}
