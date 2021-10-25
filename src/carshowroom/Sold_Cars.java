package carshowroom;

public class Sold_Cars extends Cars{
    //Declaring Variables
    private double price;
    private double commission;
    private Customer CustomerData;

    //No Parameterized Constructor
    public Sold_Cars() {
    }
        
    //Fully Parameterized Constructor
    public Sold_Cars(double price, double commission, String name, double number,
            double model, String city, String color , Customer CustomerData) {
        super(name, number, model, city, color);
        this.price = price;
        this.commission = commission;
        this.CustomerData = CustomerData;
    }

    //Setters and Getters

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public Customer getCustomerData() {
        return CustomerData;
    }

    public void setCustomerData(Customer CustomerData) {
        this.CustomerData = CustomerData;
    }
    
    
    public double Commission_Applied(double commission){
    
        return commission;
    
    }

    @Override
    public void Operation() {
    
        StateOfCar.Available();
    }


    //Overriding Calculating Amount Method 

    @Override
    public double Total_Price_Of_Deal(double price, double commission) {
        
        return price+commission;
    
    }
    
    
    
}
