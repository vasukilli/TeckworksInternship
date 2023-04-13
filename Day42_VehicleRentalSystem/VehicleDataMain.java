public class VehicleDataMain
  {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      VehicleRentalImp vri = new VehicleRentalImp();
      System.out.println("....VEHICLE RENTAL MANAGEMENT SYSTEM....");
      System.out.println("1.Add vehicle data");
      System.out.println("2.Display customer data");
      System.out.println("3.Display rented vehicle data");
      System.out.println("4.Find rented vehicle cost");
      System.out.println("5.To generate mobile verification");
      System.out.println("6.The range of vehicle spped");
      System.out.println("7.Type of vehicle ");
      System.out.println("8.Existing the process...");
      int ca; 
      do{
        System.out.println("enter the case value between the 1 to 8");
         ca = sc.nextInt();
        switch(ca){
          case 1 : vri.add_vehicle_Data();
            break;
          case 2 : vri.display_customerData();
            break;
          case 3 : vri.display_rent_vehicleData();
            break;
          case 4 : vri.find_rent_vehicleCost();
            break;
          case 5 : vri.generate_mobile_verification();
            break;
          case 6 : vri.vehicleKMRange();
            break;
          case 7 : vri.TypeOfVehicle();
            break;
          case 8 : vri.exit();
            break;
          System.out.println("enter valid option only");
            
          
        }
        
        
      }while(ca != 8);
      
    }
  }