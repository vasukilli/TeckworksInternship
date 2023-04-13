import java.util.*;
class PlayerImp implements PlayerInterface
  {
    ArrayList<PlayerData> pob = new ArrayList<PlayerData>();
    Scanner sc = new Scanner(System.in);

    public void insert()
    {
      System.out.println("enter player details like team name , player name , jersy no , noof matches , noof runs , noof wins");
      String tn = sc.next();
      String pn = sc.next();
      int jn = sc.nextInt();
      int nm = sc.nextInt();
      int nr = sc.nextInt();
      int nw = sc.nextInt();
      pob.add(new PlayerData(tn,pn,jn,nm,nr,nw));
    }
    public void delete()
    {
      if(pob.size() == 0){
        System.out.println("no data available to delete the player details");
      }else{
        String verify = null;
        System.out.println("enter player name to delete the data");
        String pname = sc.next();
        for(PlayerData e:pob){
          if(e.getPlayer_name().contains(pname)){
            pob.remove(e);
            verify = "update";
            break;
          }if(verify == null){
            System.out.println("no data available for delete so already deleted");
          }
        }
      }
    }
    public void search()
    {
      if(pob.size() == 0){
        System.out.println("no data available for searching");
      }else{
        String verify = null;
        System.out.println("enter jersy number for searching the player details");
        int jernum = sc.nextInt();
        for( PlayerData e: pob){
          if(e.getJersy_no() == jernum){
            System.out.println(e.getTeam_name() + " " + e.getPlayer_name() + " " + e.getJersy_no() + " " + e.getNoof_matches() + " "+ e.getNoof_runs() + " " + e.getNoof_wins());
          }
        }
      }
    }
    public void display()
    {
      if(pob.size() == 0){
        System.out.println("no player data available for displaying");
      }else{
        Iterator itr = pob.iterator();
        if(itr.hasNext()){
          System.out.println(itr.next());
        }
      }
    }
  }