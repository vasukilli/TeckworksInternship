import java.util.*;
class VehicleRentalImp implements VehicleRentalInt
  {
    ArrayList<VehicleData> vd = new ArrayList<>();
    ArrayList<CustomerData> cd = new ArrayList<>();
    ArrayList<RentalData> rd = new ArrayList<>();
    
    Scanner sc = new Scanner(System.in);

    public void add_vehicle_Data(){
      System.out.println("enter vehicle data like name,type , model , number  and color");
       String vehicle_name = sc.next();
       String vehicle_type = sc.next();
       String vehicle_model = sc.next();
       int vehicle_number = sc.nextInt();
       String vehicle_color = sc.next();
      vd.add(new VehicleData(vehicle_name,vehicle_type,vehicle_model,vehicle_number,vehicle_color));
    }
    public void display_customerData(){
      
    }
    public void display_rent_vehicleData(){
      
    }
    public void find_rent_vehicleCost(){
      
    }
   
    public void generate_mobile_verification(){
      
    }
    public void vehicleKMRange(){
      
    }
    public void TypeOfVehicle(){
      
    }
    public void exit(){
      
    }
    
    
  }