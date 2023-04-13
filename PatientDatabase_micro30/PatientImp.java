import java.util.*;
class PatientImp implements PatientInterface
  {
    ArrayList<PatientData> pd = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void insert()
    {
      System.out.println("enter patient details likeid , name , age and problem");
      int i = sc.nextInt();
      String n = sc.next();
      int a = sc.nextInt();
      String h = sc.next();
      pd.add(new PatientData(i,n,a,h));
      
    }
    public void delete()
    {
      if(pd.size() == 0){
        System.out.println("no details available to delete");
      }else{
        String verify = null;
        System.out.println("enter patient id to delete the details");
        int pid  = sc.nextInt();
        for(PatientData p : pd){
          if(p.getId() == pid)
              pd.remove(p);
        verify = "found";
        if(verify == null){
          System.out.println("no data to delete");
        }
          
      }
      }
    }
    public void search()
    {
      if(pd.size() == 0){
        System.out.println("no data available to search");
      }else{
        String verify = null;
        System.out.println("enter patient id to search the details");
        int pid = sc.nextInt();
        for(PatientData p : pd)
          if(p.getId() == pid){
          System.out.println(p.getId() + " " + p.getName() + " " + p.getAge() + " " + p.getHealth_pblm());

          verify = "found";
          }if(verify == null){
          System.out.println("no data to searching");
          }
      }
      
      
    }
    public void display()
    {
      if(pd.size() == 0){
        System.out.println("no data to display");
      }else{
        Iterator itr = pd.iterator();
        while(itr.hasNext()){
          System.out.println(itr.next());
        }
      }
      
    }
  }