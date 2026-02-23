package service;

import config.DBConfig;
import entity.Customers;
import entity.Invoices;

import  java.sql.*;
import java.util.*;

public class InvoiceService {

    //addInvoice in DB
    public void addInvoice(Invoices invoice) throws SQLException, ClassNotFoundException {
        Connection conn = DBConfig.getConnection();
        PreparedStatement ps = conn.prepareStatement("INSERT INTO INVOICES (CUST_ID, VHCL_ID, SRVC_ID) VALUES (?,?,?)");

        ps.setInt(1, invoice.getCustomerId());
        ps.setInt(2, invoice.getVehicleId());
        ps.setInt(3, invoice.getServiceId());

        ps.executeUpdate(); // save the customer
        ps.close();
        conn.close();
    }

    // list of invoices
    public List<Invoices> getAllInvoices() throws SQLException {
        List<Invoices> invList = new ArrayList<>();
        Connection conn = DBConfig.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM invoices");
        while(rs.next()) {
            invList.add(new Invoices(rs.getInt("id"), rs.getInt("customer_id"), rs.getInt("vehicle_id"), rs.getInt("service_id")));
        }
        return invList;
    }
}
