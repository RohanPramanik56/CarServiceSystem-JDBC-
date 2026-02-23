package service;

import config.DBConfig;
import entity.Customers;

import java.sql.*;
import java.util.*;

public class CustomerService {

    // Method to add customer in DB
    public void addCustomer(Customers customer) throws SQLException {
        Connection conn = DBConfig.getConnection();
        PreparedStatement ps = conn.prepareStatement("INSERT INTO customers (NAME, PHONE_NO, NO_OF_CAR) VALUES (?,?,?)");

        ps.setString(1, customer.getName());
        ps.setString(2, customer.getPhoneNo());
        ps.setInt(3, customer.getNoOfCars());

        ps.executeUpdate(); // save the customer
        ps.close();
        conn.close();
    }


    // list of customers
    public List<Customers> getAllCustomers() throws SQLException {
        List<Customers> custList = new ArrayList<>();
        Connection conn = DBConfig.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM customers");
        while(rs.next()) {
            custList.add(new Customers(rs.getInt("id"), rs.getString("name"), rs.getString("phone_no"), rs.getInt("no_of_cars")));
        }
        return custList;
    }
}
