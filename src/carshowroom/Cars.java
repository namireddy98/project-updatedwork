package carshowroom;

public class Cars implements Factory,Observer,Command{
    //Declaring Variables
    private String name;
    private double number;
    private double model;
    private String city;
    private String color;
    State StateOfCar;
    
    //No Parameterized Constructor
    public Cars() {
    }

    //Fully Parameterized Constructor
    public Cars(String name, double number, double model, String city, String color) {
        this.name = name;
        this.number = number;
        this.model = model;
        this.city = city;
        this.color = color;
    }

    //Setters and Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public double getModel() {
        return model;
    }

    public void setModel(double model) {
        this.model = model;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
   
    
    @Override
    public double Total_Price_Of_Deal(double i, double z){
        return i*z;
    }
  
    @Override
    public void Factory_Previous_Deal_Info() {
    
        System.out.println("Last Car Deal With This Copmany");
        System.out.println("Car Name: "+name);
        System.out.println("Car Number: "+number);
        System.out.println("Car Model: "+model);
        System.out.println("Color: "+color);
        System.out.println("City of Registeration: "+city);      
    }
    
    @Override
    public void Operation() {
    	
    }
}
