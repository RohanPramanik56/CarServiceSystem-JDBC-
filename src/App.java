import entity.Customers;
import service.BillingService;

import java.sql.SQLException;
import java.util.*;

public class App {
    static void main() throws SQLException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        BillingService billingService = new BillingService();

        // will run unlimited
        while (true) {
            System.out.print("1. Enter 1 to add customer \n2. Generate Invoice \n3. Show Invoice \n4. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String customerName = sc.next();
                    System.out.print("Enter customer Number: ");
                    String phoneNumber = sc.next();
                    System.out.print("No of cars: ");
                    int cars = sc.nextInt();
                    billingService.customerService.addCustomer(new Customers(0, customerName, phoneNumber, cars));
                    break;
                case 2:
                    System.out.println("Enter customer ID: ");
                    int customerID = sc.nextInt();
                    System.out.println("Enter Vehicle ID: ");
                    int vehicleID = sc.nextInt();
                    System.out.println("Enter number of services: ");
                    int numOfServices = sc.nextInt();
                    List<Integer> services = new ArrayList<>();
                    for (int i = 0; i < numOfServices; i++) {
                        System.out.println("Enter service ID: ");
                        services.add(sc.nextInt());
                    }
                    billingService.createInvoice(customerID, vehicleID, services);
                case 3:
                    billingService.showAllInvoices();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
