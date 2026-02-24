package service;
import entity.Invoices;

import java.sql.SQLException;
import java.util.*;

public class BillingService {

    public CustomerService customerService = new CustomerService();
    public InvoiceService invoiceService = new InvoiceService();

    // function to generate invoice
    public void createInvoice(int customerId, int vehicleId, List<Integer> serviceIds) throws SQLException, ClassNotFoundException {
        String sids = "";
        for(Integer serviceId : serviceIds) {
            sids += serviceId;
        }
        invoiceService.addInvoice(new Invoices(0, customerId, vehicleId, Integer.parseInt(sids)));
        System.out.println("Invoice generated successfully....");
    }

    // show all invoice
    public void showAllInvoices() throws SQLException, ClassNotFoundException {
        List<Invoices> invoices = invoiceService.getAllInvoices();
        for(Invoices invoice : invoices) {
           // System.out.println(invoice.toString());
           System.out.println(invoice);
        }
    }
}
