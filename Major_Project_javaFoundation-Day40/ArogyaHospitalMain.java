import java.util.*;
public class ArogyaHospitalMain
  {
    public static void main(String[] args) throws InvalidDataException
    {
      Scanner sc = new Scanner(System.in);
      ArogyaHospitalImplementation ahi = new ArogyaHospitalImplementation();
      System.out.println("....Arogya Hospital....");
      System.out.println("1.Add patient details..");
      System.out.println("2.view/display patient details..");
      System.out.println("3.search patient by  patient details..");
      System.out.println("4.search patient city details..");
      System.out.println("5.search patient id  details..");
      System.out.println("6.recovery and delete of  patient details..");
      System.out.println("7.search patient age by patient details..");
      System.out.println("8.Arogya hospital contact details..");

      int val;
      char ch;
      do{
        System.out.println("enter any option from above details 1 to 8 only");
        val = sc.nextInt();
        switch(val){
            
          case 1:ahi.add_Patient_Details();
            break;
          case 2:ahi.view_Patient_Details();
            break;
          case 3:ahi.searchName();
            break;
          case 4:ahi.searchCity();
            break;
          case 5: try{
            ahi.searchId();
          }catch(NullPointerException e){
            System.out.println("ERROR");
          }
            break;
          case 6:ahi.recoveryOfPatients();
            break;
          case 7:try{
            ahi.search_Age();
          }catch(NullPointerException e){
            System.out.println("ERROR");
          }
            break;
          case 8:ahi.Contact_us();
            break;
          default:System.out.println("enter valid option only");
            
        }
        System.out.println("you want another more details about patient then enter ..y or if you want the stop the process then enter n");
        
       ch = sc.next().charAt(0); 
      }while(ch != 'n');
      
      
    }
  }