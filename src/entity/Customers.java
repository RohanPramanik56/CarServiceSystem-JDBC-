package entity;

public class Customers {
    private int id;
    private String name;
    private String phoneNo;
    private int noOfCars;

    //constructor
    public Customers(int id, String name, String phoneNo, int noOfCars) {
        this.id = id;
        this.name = name;
        this.phoneNo = phoneNo;
        this.noOfCars = noOfCars;
    }

    // Getter and Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getNoOfCars() {
        return noOfCars;
    }

    public void setNoOfCars() {
        this.noOfCars = noOfCars;
    }

    @Override
    public String toString() {
        return "Customer ID: " + id + ", Name: " + name + ", Phone No: " + phoneNo + "Cars count: " + noOfCars;
    }
}
