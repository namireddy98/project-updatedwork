package carshowroom;

public class Customer {
	   
    //Declaring Variables
private int id;
private String CustomerName;
private String CNIC;
private String address;

//No parameterized Constructor
public Customer() {
}

//Fully Parameterized Constructor
public Customer(int id, String CustomerName, String CNIC, String address) {
    this.id = id;
    this.CustomerName = CustomerName;
    this.CNIC = CNIC;
    this.address = address;
}

//Setters and Getters
public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getCustomerName() {
    return CustomerName;
}

public void setCustomerName(String CustomerName) {
    this.CustomerName = CustomerName;
}



public String getCNIC() {
    return CNIC;
}

public void setCNIC(String CNIC) {
    this.CNIC = CNIC;
}

public String getAddress() {
    return address;
}

public void setAddress(String address) {
    this.address = address;
}

}
