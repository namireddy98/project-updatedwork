package carshowroom;

import java.util.Scanner;

public class CarsShowRoom {
    public static void main(String[] args) {
        // TODO code application logic here
        
           
      Scanner sc = new Scanner(System.in);
        
                  System.out.println("\n");
                  
                  String choice= Start();
                  
        //If conditions for different types of Data
        
        if(choice.equalsIgnoreCase("Sale")){
            
            SoldCar();
       
        }
        
        else if(choice.equalsIgnoreCase("Purchase")){
        
            BoughtCar();
       
        }
        
        else if(choice.equalsIgnoreCase("Rent")){
        
            RentedCar();
        
        }
        
        Update_Data();
        
                  
        
    }
    
    public static  void Update_Data(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Whether You Want To Update Data: Yes/No?");
        
        String up = sc.nextLine();
        
        if(up.equalsIgnoreCase("Yes")){
            System.out.println("Select Whether You want to Update Data Of:"
                    + "\n Sale, Purchase or Rent Cars");
            
            String choice1 = sc.nextLine();
            
        if(choice1.equalsIgnoreCase("Sale")){
            
            SoldCar();
       
        }
        
        else if(choice1.equalsIgnoreCase("Purchase")){
        
            BoughtCar();
       
        }
        
        else if(choice1.equalsIgnoreCase("Rent")){
        
            RentedCar();
        
        }    
            
        }
        else if(up.equalsIgnoreCase("No")){
            System.out.println("Thank You For Being Here!");
        }
        
       
    }
    public static String Start(){
        //Scanner Objects
        Scanner sc  = new Scanner(System.in);
        Scanner ic = new Scanner(System.in);
       
        
    
               System.out.println("Welcome To CarShowRoom");
               
               
               
               
                  System.out.println("\n");
        System.out.println("Select Whether You want to Sale or Purchase or give Car on Rent: ");
        System.out.println("Write Sale for selling "
                + "\nWrite Purchase for Purchasing "
                + "\nWrite Rent for Giving on Rent: ");
        
        String choice = sc.nextLine();  
        
        return choice;
    }
    
    public static void RentedCar(){
        
          Scanner ic = new Scanner(System.in);
        Scanner dc = new Scanner(System.in);
        Scanner name = new Scanner(System.in);
        Scanner carz = new Scanner(System.in);
        
        
            System.out.println("You have Selected to Rent: ");
            
            System.out.println("Enter How Many Cars On Rent: ");
            int numOfRent = ic.nextInt();
            
            for(int x = 0 ; x < numOfRent; x++){
             
                System.out.println("Enter Information Of Customer of Car "+ (x+1));
                             System.out.print("Enter Id = ");
        
                             int id = ic.nextInt();
        
                             System.out.print("Enter name = ");
        
                             String Name = name.nextLine();
        
        
                             System.out.print("Enter cnic = ");
        
                             String cnic = name.nextLine();
        
                             System.out.print("Enter address = ");
       
                             String address = name.nextLine();
        
                             Customer P1 = new Customer();
       
                             P1.setId(id);
                             P1.setCustomerName(Name);
                             P1.setCNIC(cnic);
                             P1.setAddress(address);
                             
                
                             System.out.println("Enter Information Of Car  " +(x+1));

                             Rent_Cars cars = new Rent_Cars();
            
                             System.out.print("Enter name = ");
              
                             String name1 = carz.nextLine();
            
                             System.out.print("Enter Car Number = ");
            
                             
                             
                             double number = dc.nextDouble();
           
                             System.out.println("Checking Availbility of Car");
                             
                             
                                 cars.Operation();
                            
                             
                             System.out.print("Enter Car Model = ");
          
                             double model = dc.nextDouble();
            
            
                             System.out.print("Enter city = ");
            
                             String city = carz.nextLine();
            
                             System.out.print("Enter color = ");
           
                             String color = carz.nextLine();
          
                             System.out.println("Enter Price charged per Day: ");
         
                             double perDay = dc.nextDouble();
         
                             System.out.println("Enter For How many Days, Car is rented: ");
            
                             double Days = dc.nextDouble();

       
                             cars.setName(name1);
        
                             cars.setNumber(number);
        
                             cars.setModel(model);
      
                             cars.setCity(city);       
       
                             cars.setColor(color);   
     
                             cars.setPerDay(perDay);
     
                             cars.setDays(Days);
       
                             cars.Total_Price_Of_Deal(Days, perDay);
                             
                             
       
                             
           
       
                
                System.out.println("Total Amount For Car is: "+cars.Total_Price_Of_Deal(Days, perDay)); 
            
               
               
            
            
        }
        
    }
    
    public static void BoughtCar(){
        
        
          Scanner ic = new Scanner(System.in);
          Scanner sc = new Scanner(System.in);
        Scanner dc = new Scanner(System.in);
        Scanner name = new Scanner(System.in);
        Scanner carz = new Scanner(System.in);
       
        System.out.println("Enter How Many Cars Purchased: ");
            int numOfPurchased = ic.nextInt();
            
            for(int x = 0 ; x < numOfPurchased ; x++){
                System.out.println("You have Selected To Purchase: ");
            
                System.out.println("Enter Information Of Seller of Car "+ (x+1));
                                           
                System.out.print("Enter Id = ");
        
                int id = sc.nextInt();
        
                System.out.print("Enter name = ");
        
                String Name = name.nextLine();
        
                System.out.print("Enter cnic = ");
        
                String cnic = name.nextLine();
        
                System.out.print("Enter address = ");
        
                String address = name.nextLine();
        
                Customer P1 = new Customer();
       
                 P1.setId(id);
                 P1.setCustomerName(Name);
                 P1.setCNIC(cnic);
                 P1.setAddress(address);
                
  
                System.out.println("Enter Information Of Car " +(x+1));
          
              
            
                Cars car = new Cars();
            
                Bought_Cars cars = new Bought_Cars();
       
                System.out.print("Enter name = ");
        
                String n = carz.nextLine();
            
                System.out.print("Enter Car Number = ");
            
                double number = dc.nextDouble();
                
                System.out.println("Checking Availbility of Car");
                             
                             
                                 cars.Operation();
                
                System.out.print("Enter Car Model = ");
            
                double model = dc.nextDouble();
            
                System.out.print("Enter city = ");
            
                String city = carz.nextLine();
            
                System.out.print("Enter color = ");
            
                String color = carz.nextLine();
            
                System.out.println("Enter Price of Car: ");
            
                double price = dc.nextDouble();
                
       
                cars.setName(n);
       
                cars.setNumber(number);
       
                cars.setModel(model);
        
                cars.setCity(city);       
        
                cars.setColor(color);   
        
                cars.setPrice(price);
         
                cars.Total_Price_Of_Deal(price, 0);
        
        
       
                Cars purchased = new Bought_Cars( price ,n,number,model,city,color, P1);
                
                System.out.println("Total Amount For Car is: "+purchased.Total_Price_Of_Deal(price, 0)); 
            
            }
        
    }
    
    public static void SoldCar(){
        
          Scanner ic = new Scanner(System.in);
        Scanner dc = new Scanner(System.in);
        Scanner name = new Scanner(System.in);
        Scanner carz = new Scanner(System.in);
        
            System.out.println("Enter For How Many Cars Sold:");
            int numOfSold = ic.nextInt();
        
            for(int i = 0 ; i < numOfSold ; i++){
            
                System.out.println("You have Selected To Sale: ");
            
                System.out.println("Enter Information Of Buyer of Car "+ (i+1));
                 System.out.print("Enter Id = ");
        
                 int id = ic.nextInt();
        
                 System.out.print("Enter name = ");
        
                 String Name = name.nextLine();
        
                 System.out.print("Enter cnic = ");
        
                 String cnic = name.nextLine();
        
        
                 System.out.print("Enter address = ");
        
                 String address = name.nextLine();
       
                 Customer P1 = new Customer();
       
                 P1.setId(id);
                 P1.setCustomerName(Name);
                 P1.setCNIC(cnic);
                 P1.setAddress(address);
              
           
   
                System.out.println("Enter Information Of Car " +(i+1));

               Cars car = new Cars();
               
               Sold_Cars cars = new Sold_Cars();
       
               System.out.print("Enter name = ");
        
               String n = carz.nextLine();
            
               System.out.print("Enter Car Number = ");
            
               double number = dc.nextDouble();
               
               System.out.println("Checking Availbility of Car");
                             
                             
                                 cars.Operation();
            
               System.out.print("Enter Car Model = ");
            
               double model = dc.nextDouble();
            
            
               System.out.print("Enter city = ");
            
               String city = carz.nextLine();
            
               System.out.print("Enter color = ");
            
               String color = carz.nextLine();
            
               System.out.println("Enter Price of Car: ");
            
               double price = dc.nextDouble();
            
               System.out.println("Enter Commission Applied: ");
            
               double commission = dc.nextDouble();
       
               cars.setName(n);
      
               cars.setNumber(number);
      
               cars.setModel(model);
        
               cars.setCity(city);       
      
               cars.setColor(color);   
       
               cars.setPrice(price);
       
               cars.setCommission(commission);
        
               cars.Total_Price_Of_Deal(price, commission);
        
              
               
               Cars sold = new Sold_Cars( price , commission ,n,number,model,city,color, P1);
 
                System.out.println("Total Amount For Car is: "+sold.Total_Price_Of_Deal(price, commission)); 
            
        }
    }
    
}
