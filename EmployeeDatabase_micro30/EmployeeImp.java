import java.util.*;
//import EmployeeDatabase.EmployeeImp;
//import EmployeeDatabase.EmployeeInterface;
class EmployeeImp implements EmployeeInterface
  {
    ArrayList<EmployeeData> emparr = new ArrayList<>();
     Scanner s = new Scanner(System.in);
    public void insert()
    {
      //Scanner s = new Scanner(System.in);
      System.out.println("enter employee details l ike id , name,sal");
      int id = s.nextInt(); 
      String name = s.next();
      double sal = s.nextDouble();

      emparr.add(new EmployeeData(id,name,sal));
      
    }
   public void delete()
    {
      if(emparr.size() == 0){
        System.out.println("no datais available to delete");}
      else{
        String verify = null;
        System.out.println("enter emp id to delete dTAata");
        int empid= s.nextInt();
        for(EmployeeData e : emparr)
          {
            if(e.getEmpid() == empid)
              emparr.remove(e);
            verify = "found";
            break;
          }
        if(verify == null)
          System.out.println("no data is to delete data");
          }
          
      }
      
    public void search()
    {
      if(emparr.size() == 0){
        System.out.println("no datais available to search");}
      else{
        String verify = null;
        System.out.println("enter emp id to search dTAata");
        int empid= s.nextInt();
        for(EmployeeData e : emparr)
          {
            if(e.getEmpid() == empid)
             System.out.println(e.getEmpid() +" " + e.getEmpname() + " " + e.getSalary());
            verify = "found";
            break;
          }
        if(verify == null)
          System.out.println("no data is to delete data");
      
      
    }}
    public void display()
    {
      if(emparr.size() == 0){
        System.out.println("no data is available");
      }else{
      Iterator itr = emparr.iterator();
      while(itr.hasNext())
        System.out.println(itr.next());
    }
    }
    
  }