package service;

import config.DBConfig;
import entity.Invoices;

import  java.sql.*;
import java.util.*;

public class InvoiceService {

    public void addInvoice(Invoices invoice) throws SQLException, ClassNotFoundException {
        Connection conn = DBConfig.getConnection();
        PreparedStatement ps = conn.prepareStatement("INSERT INTO INVOICES (INV_ID, CUST_ID, VHCL_ID, SRVC_ID) VALUES (?,?,?,?)");

        ps.setString(1, invoice.getName());
        ps.setString(2, invoice.getPhoneNo());
        ps.setInt(3, invoice.getNoOfCars());

        ps.executeUpdate(); // save the customer
        ps.close();
        conn.close();
    }
}
