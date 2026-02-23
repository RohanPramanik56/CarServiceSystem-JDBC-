package entity;

public class Invoices {
    private int id;
    private int customerId;
    private int vehicleId;
    private int serviceId;

    // constructor
    public Invoices(int id, int customerId, int vehicleId, int serviceId) {
        this.id = id;
        this.customerId = customerId;
        this.vehicleId = vehicleId;
        this.serviceId = serviceId;
    }

    //getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    // toString method
    @Override
    public String toString() {
        return "Invoice " +  "{ ID" + id + "Customer ID: " + customerId + "Vehicle ID: " + vehicleId + "Service ID: " + serviceId + " }";
    }
}
