import java.util.*;
class AddressBookImp implements AddressBookInterface
  {
    Scanner sc = new Scanner(System.in);
    HashMap<AddressBookData> hm = new HashMap<>();
    public void add()
    {
      System.out.println("add the contact details of person name and phone number");
      
      long p = sc.nextLong();
      String n = sc.next();
      hm.put(new AddressBookData(p,n));
    }
    public void edit()
    {
      if(hm.size() == 0){
        System.out.println("no data available for editing");
      }else{
        System.out.println("enter the new contact name");
        String nam = sc.next();
        System.out.println("enter new phone number");
        long ph = sc.nextLong();
        Set s1 = hm.entrySet();
        Iterator itr = s1.iterator();
        while(itr.hasNext()){
          Map.Entry m1 = (Map.Entry)itr.next();
          if(m1.getKey().equals(nam)){
            m1.setValue(ph);
          }
        }
      }
      
    }
    public void delete_contact()
    {
      if(hm.size() == 0){
        System.out.println("no data available for deleting");
      }else{
        String verify = null;
        System.out.println("enter contact name");
        String cnam = sc.next();
        for(String v : hm.keySet()){
          if(cnam.equals(v)){
            hm.remove(cnam);
            verify = "found";
            break;
          }if(verify != "found"){
            System.out.println("already deleted");
          }
        }
      }
    }
    public void search_cont_name()//to search for a contact by name.
    {
      if(hm.size() == 0){
        System.out.println("no data available for searching");
      }else{
        String verify = null;
        System.out.println("enter contact name");
        String cnam = sc.next();
        for(String v : hm.keySet()){
          if(cnam.equals(v)){
            hm.get(cnam);
            verify = "found";
            break;
          }if(verify != "found"){
            System.out.println("already searched");
          }
        }
      }
      }
}