package carshowroom;

public class Bought_Cars extends Cars{
    
    //Declaring Variables
    private double price;
    private Customer CustomerData;

    //No Parameterized Constructor
    
    public Bought_Cars() {
    }

    //Fully Parameterized Constructor
    
    public Bought_Cars(double price, String name, double number, 
            double model, String city, String color,Customer CustomerData ) {
        super(name, number, model, city, color);
        this.price = price;
        this.CustomerData = CustomerData;
    }

    //Setters and and Getters
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Customer getCustomerData() {
        return CustomerData;
    }

    public void setCustomerData(Customer CustomerData) {
        this.CustomerData = CustomerData;
    }

     @Override
    public void Operation() {
    
        StateOfCar.Available();
    }


    
    
    

    //Overriding method for calculating Total Amount

    @Override
    public double Total_Price_Of_Deal(double price, double i) {
        
        //Becasue no commission applied on Bought Cars
        i=0;
        
        return price+i;
                
    }
    
    
   
    
    
}
