package day9.Services;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    protected Scanner sc = new Scanner(System.in);
    private String idNumber;
    private String name;
    private double salary;
    protected static ArrayList<Employee> employees = new ArrayList<>();

    public Employee(String idNumber, String name, double salary) {
        this.idNumber = idNumber;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {

    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        if (salary >= 15000000) {
            return (salary * 88 / 100);
        } else if (salary >= 9000000) {
            return (salary * 90 / 100);
        } else
            return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void addEmployee() {
        System.out.println("nhap ma nhan vien: ");
        idNumber = sc.nextLine();
        System.out.println("nhap ho va ten nhan vien: ");
        name = sc.nextLine();
        System.out.println("nhap luong: ");
        salary = sc.nextDouble();
        sc.nextLine();
    }

    public static void displayEmployee() {
        for (Employee employee : employees) {
            if (employee instanceof DepartmentHeads) {
                DepartmentHeads dm = (DepartmentHeads) employee;
                System.out.println(dm.toString());
            } else if (employee instanceof MarketingStaff) {
                MarketingStaff ms = (MarketingStaff) employee;
                System.out.println(ms.toString());
            } else {
                System.out.println(employee.toString());
            }
        }
    }

    @Override
    public String toString() {
        return "Ma nhan vien: " + idNumber + "\n" + "Ho va ten: " + name + "\n" + "Luong co ban: "
                + String.format("%.0f", salary);
    }

    public static void findEmployeeByIdNumber(String idNumber) {
        for (Employee employee : employees) {
            if (employee.getIdNumber().equalsIgnoreCase(idNumber)) {
                employee.displayEmployee();
            }
        }
    }

    public static void deleteEmployeeByIdNumber(String idNumber) {
        employees.removeIf(v -> v.getIdNumber().equalsIgnoreCase(idNumber));
    }

    public static void updateEmployeeByIdNumber(String idNumber) {
        Scanner sc = new Scanner(System.in);
        for (Employee employee : employees) {
            if (employee.getIdNumber().equalsIgnoreCase(idNumber)) {
                System.out.println("Cap nhat lai thong tin nhan vien " + employee.getName());
                System.out.println("Nhap lai ten: ");
                employee.setName(sc.nextLine());
                System.out.println("nhap lai ma nhan vien: ");
                employee.setIdNumber(sc.nextLine());
                System.out.println("nhap lai luong");
                employee.setSalary(sc.nextDouble());
                if (employee instanceof MarketingStaff) {
                    System.out.println("Cap nhat doanh so(%): ");
                    ((MarketingStaff) employee).setDoanhSo(sc.nextDouble());
                    System.out.println("Cap nhat hoa hong(%): ");
                    ((MarketingStaff) employee).setHoaHong(sc.nextDouble());
                }
                if (employee instanceof DepartmentHeads) {
                    System.out.println("Cap nhat luong trach nhiem: ");
                    ((DepartmentHeads) employee).setTrachNhiem(sc.nextDouble());
                }
                System.out.println("Cap nhat thong tin thanh cong");
                return;
            }
        }
        System.out.println("Khong tim thay nhan vien trong danh sach");
    }

    public static void findEmployeeBySalary(double leftLimit, double rightLimit) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= leftLimit && employee.getSalary() <= rightLimit) {
                employee.displayEmployee();
            }
        }
    }

    public static void sortByName() {
        employees.sort((v1, v2) -> v1.getName().compareTo(v2.getName()));
    }

    public static void sortBySalary() {
        employees.sort((v1, v2) -> Double.compare(v1.getSalary(), v2.getSalary()));
    }

    public static void displayFiveEmployee() {
        if (employees.size() > 5) {
            for (int i = 0; i < 5; i++) {
                employees.get(i).displayEmployee();
            }
        } else {
            for (Employee employee : employees) {
                employee.displayEmployee();
            }
        }
    }
}
