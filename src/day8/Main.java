package day8;

import java.util.Scanner;
import day8.Services.Account;
import day8.Services.Car;
import day8.Services.Motorbike;
import day8.Services.Truck;
import day8.Services.Vehicle;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("username:");
        String username = sc.nextLine();
        System.out.print("password:");
        String password = sc.nextLine();

        Account acc = new Account(username, password);
        if (Account.check(acc)) {
            int choice = 1;
            do {
                System.out.println("========================================================================");
                System.out.println("1.Them phuong tien");
                System.out.println("2.Tim phuong tien theo thong so xe");
                System.out.println("3. Tim phuong tien theo chu xe co so cmnd tuong ung");
                System.out.println("4. Xoa tat ca phuong tien cua mot nha san xuat bat ky");
                System.out.println("5. Hien thi nha san xuat co nhieu xe nhat dang duoc quan ly");
                System.out.println("6. Sap xep theo thong so xe giam dan");
                System.out.println("7. Luu moi loai phuong tien ra mot file csv tuong ung");
                System.out.println("8. Doc cac file csv va xuat tat ca phuong tien ra man hinh");
                System.out.println("9. Thong ke moi loai phuong tien co bao nhieu xe dang duoc quan ly");
                System.out.println("10. Thoat");
                System.out.println("========================================================================");
                System.out.print("nhap lua chon:");
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("nhap loai phuong tien:");
                        String type = sc.nextLine();
                        String[] types = { "car", "motorbike", "truck" };
                        for (int i = 0; i < types.length; i++) {
                            if (type.compareToIgnoreCase(types[i]) == 0) {
                                switch (types[i].toLowerCase()) {
                                    case "car":
                                        Car car = new Car();
                                        car.addVehicle();
                                        System.out.println("them xe o to thanh cong");
                                        break;

                                    case "motorbike":
                                        Motorbike motor = new Motorbike();
                                        motor.addVehicle();
                                        System.out.println("them xe may thanh cong");
                                        break;
                                    case "truck":
                                        Truck truck = new Truck();
                                        truck.addVehicle();
                                        System.out.println("them xe tai thanh cong");
                                        break;
                                }
                            }
                        }
                        break;
                    case 2:
                        System.out.println("nhap so xe: ");
                        int vehicleNumber = sc.nextInt();
                        Vehicle.findVehicleNumber(vehicleNumber);
                        break;
                    case 3:
                        Vehicle.displayVehicles();
                        break;
                    case 4:

                        break;
                    case 5:

                        break;
                    case 6:

                        break;
                    case 7:

                        break;
                    case 8:

                        break;
                    case 9:

                        break;
                    case 10:
                        System.out.println("Bye");
                        break;

                    default:
                        System.out.println("chi nhap 1-10");
                        break;
                }
            } while (choice != 10);
        } else {
            System.out.println("Sai thong tin dang nhap");
        }
    }
}
