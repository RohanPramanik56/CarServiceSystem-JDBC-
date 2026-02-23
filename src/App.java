import entity.Customers;
import service.BillingService;

import java.sql.SQLException;
import java.util.*;

public class App {
    static void main() throws SQLException {
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

            }
        }
    }
}
