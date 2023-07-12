import java.util.*;
import java.util.ArrayList;
class InvalidDataException extends Exception
  {
   public InvalidDataException(String message){
     super(message);
   }
  }
class ArogyaHospitalImplementation implements ArogyaHospitalInterface
  {
    Scanner sc = new Scanner(System.in);
ArrayList<ArogyaHospitalData> ahd= new ArrayList<>();
public void add_Patient_Details() 
       { 
       System.out.println("Enter Patient Details");
       System.out.println("Enter Patient id:");
       int pi = sc.nextInt();
       System.out.println("Enter Patient name:");
       String n = sc.next();
       System.out.println("Enter Patient age:");
         try{
       int a = sc.nextInt();
       String ag = Integer.toString(a);
       if(ag.length()>2){
         System.out.println("invalid age");
       }
         }catch(InvalidDataException e)
       {
         //throw new InvalidDataException("enter age valid type only");
         System.out.println("enter age valid type only");
        add_Patient_Details();
       }
       System.out.println("Enter Patient gender:");
       String g = sc.next();
       System.out.println("Enter Patient adhar number:");
         try{
       long an = sc.nextLong();
       String adn = Long.toString(an);
       if(adn.length() != 12){
         System.out.println("invalid adhar");
       }}catch(InvalidDataException e)
       {
          System.out.println("enter adhar number valid type only");
        add_Patient_Details();
       }
       System.out.println("Enter Patient contact number:");
       long cn = sc.nextLong();
       String ctn = Long.toString(cn);
       if(ctn.length() != 10)
       {
         throw new InvalidDataException("enter contact number valid type only");
         //add_Patient_Details();
         
       }
       
        System.out.println("Enter Patient emergency contact number:");
       long en = sc.nextLong();
       String egn = Long.toString(en);
       if(egn.length() != 10)
       {
         throw new InvalidDataException("enter emergency contact number valid type only");
        // add_Patient_Details();
       }
       System.out.println("Enter Patient city name:");
       String c = sc.nextLine();
       System.out.println("Enter Patient address details:");
       String ad = sc.nextLine();
       System.out.println("Enter Patient date of admit:");
       String doa = sc.next();
       System.out.println("Enter Patient gurdian name:");
       String  gna = sc.nextLine();
        System.out.println("Enter Patient gurdian address:");
       String ga = sc.nextLine();
       
       System.out.println("Enter Patient gurdians emergency contact number:");
       long gcn = sc.nextLong();
       String gcnu = Long.toString(gcn);
       if(gcnu.length()<10 || gcnu.length()>10)
       {
         throw new InvalidDataException("enter emergency contact number of gurdain valid type only");
         //add_Patient_Details();
       }
       ahd.add(new ArogyaHospitalData(pi,n,a,g,an,cn,en,c,ad,doa,gna,ga,gcn));
   
     }
          
    public void view_Patient_Details()
     {
       System.out.println("This the display of patient details");
       if(ahd.size() == 0)
       {
         System.out.println("no data available for display the patient details");
       }else{
         Iterator itr = ahd.iterator();
         while(itr.hasNext()){
           System.out.println(itr.next());
         }
         
       }
            
     }
           
    public void  searchName()
      {
        System.out.println("searching patient details by his/her name");
        if(ahd.size() == 0){
          System.out.println("no patient data available for searching");
        }else{
          String verify = null;
          System.out.println("enter the patient name");
          String pnam = sc.nextLine();
          for(ArogyaHospitalData a : ahd){
            if(a.getName().equals(pnam)){
              verify = "found";
              break;
            }if(verify == "found"){
              System.out.println(a.getPatient_id() + " " + a.getName() + " " + a.getAge() + " " + a.getGender() + " " + a.getAdhar_number() + " " + a.getContact_number() + " " + a.getEmergency_number() + " " + a.getCity() + " " + a.getAddress() + " " + a.getDate_of_admit() + " " + a.getGuardians_name() + " " + a.getGuardians_addr() + " " + a.getGurdians_contact_number());
            }
          }
        }
                  
      }
           
    public void searchCity()
      {
         System.out.println("searching patient details by his/her city name");
        if(ahd.size() == 0){
          System.out.println("no patient data available for searching");
        }else{
          String verify = null;
          System.out.println("enter the patient city name");
          String cnam = sc.nextLine();
          for(ArogyaHospitalData a : ahd){
            if(a.getCity().equals(cnam)){
              verify = "found";
              break;
            }if(verify == "found"){
              System.out.println(a.getPatient_id() + " " + a.getName() + " " + a.getAge() + " " + a.getGender() + " " + a.getAdhar_number() + " " + a.getContact_number() + " " + a.getEmergency_number() + " " + a.getCity() + " " + a.getAddress() + " " + a.getDate_of_admit() + " " + a.getGuardians_name() + " " + a.getGuardians_addr() + " " + a.getGurdians_contact_number());
            }
          }
        }
                    
      }
    public void  searchId()//NullPointerException
      {
        System.out.println("this is the block of patient we can check the details by id");
        if(ahd.size() == 0){
          System.out.println("no patient data available for searching");
        }else{
          System.out.println("enter patient id for searching:");
          int pid = sc.nextInt();
          for(ArogyaHospitalData a : ahd){
          try{
            if(a.getPatient_id()==pid)
            {
              System.out.println(a.getPatient_id() + " " + a.getName() + " " + a.getAge() + " " + a.getGender() + " " + a.getAdhar_number() + " " + a.getContact_number() + " " + a.getEmergency_number() + " " + a.getCity() + " " + a.getAddress() + " " + a.getDate_of_admit() + " " + a.getGuardians_name() + " " + a.getGuardians_addr() + " " + a.getGurdians_contact_number());
            }
            
          }catch(NullPointerException e){
            System.out.println("enter valid patient id only,this is invalid id");
            searchId();
          }
          
        }
        }
      }
    public void  recoveryOfPatients()
      {
        System.out.println("this is the module of recovery patient details");
        if(ahd.size() == 0){
          System.out.println("no data available for recovery information");
        }else{
          String verify = null;
          System.out.println("enter the recovery of patient ids");
          int rid = sc.nextInt();
          for(ArogyaHospitalData a : ahd){
            if(a.getPatient_id()==rid){
              verify = "found";
              break;
            }else{
              System.out.println("patient is not recovered");
            }if(verify == "found"){
              ahd.remove(a);
              System.out.println("recovered patient data deleted");
            }
          }
        }
                      
      }
   
    public void  search_Age()//NullPointerException
      {
        System.out.println("Searching the patient deatils under the age group");
        if(ahd.size() == 0){
          System.out.println("no patient data available for searching");
        }else{
          System.out.println("enter age groups");
          for(ArogyaHospitalData a : ahd){
          try{  
          int age1 = sc.nextInt();
          int age2 = sc.nextInt();
            if(a.getAge() == age1){
            for(int i=age1;i<=age2;i++){
            
            {
              System.out.println(a.getPatient_id() + " " + a.getName() + " " + a.getAge() + " " + a.getGender() + " " + a.getAdhar_number() + " " + a.getContact_number() + " " + a.getEmergency_number() + " " + a.getCity() + " " + a.getAddress() + " " + a.getDate_of_admit() + " " + a.getGuardians_name() + " " + a.getGuardians_addr() + " " + a.getGurdians_contact_number());
            }}
          }else{
              System.out.println("invalid age");
            }
          }catch(NullPointerException e){
            System.out.println("enter valid age only");
            search_Age();
          }
          
           
          }
        }
    }
    public void  Contact_us()//This is arogyasethu contact details..
    //In this module we should include all contact details of hospitals like Address, Phone No,	Email address, Mobile No., Customer Support, Ambulance Contact No., Website, etc.
      {
        System.out.println("This is the domain of Arogyasethu hospital contact details");
        System.out.println("Details are ---> Address, Phone No,	Email address, Mobile No., Customer Support, Ambulance Contact No., Website");
        String address = "vijayawada";
        System.out.println("address :" + address);
        long phnum = 6301725926l;
        System.out.println("phone number :" + phnum );
        String emailaddress = "arogya123@gmail.com";
        System.out.println("emailaddress :" + emailaddress);
        long mbnum = 630172565l;
        System.out.println("mobile number :" + mbnum );

        int ambnum = 108;
        System.out.println("ambulence number :" + ambnum );
        String website = "arogya.com";
        System.out.println("emailaddress :" + website);
        
      }
    
  }