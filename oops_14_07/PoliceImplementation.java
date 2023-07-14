package com.firstProject;
import java.util.*;
class PoliceImplementation implements PoliceInterface
{
	Scanner sc = new Scanner(System.in);
	ArrayList<PoliceData> pd = new ArrayList<PoliceData>();
	
	public void insert()
	{
		System.out.println("enter police deails like id , name , salary ,age and experience also gender ");
		int pi = sc.nextInt();
		String pn = sc.next();
		double ps = sc.nextDouble();
		int pa = sc.nextInt();
		int pe = sc.nextInt();
		String pg = sc.next();
		
		pd.add(new PoliceData(pi,pn,ps,pa,pe, pg));
	}

	
	public void delete() 
	{
		if(pd.size() == 0) {
			System.out.println("no data available for deleting ");
		}else {
			String verify = null;
			System.out.println("enter name for deleting the police data");
			String pnam = sc.next();
			for(PoliceData e : pd) {
			if(e.getPol_name().equals(pnam)) {
				pd.remove(e);
				verify = "found";
				break;
			}
			}if(verify == null) {
				System.out.println("already police data deleted");
			}
				
	}}

	public void search() {
		if(pd.size() == 0) {
			System.out.println("no data available for searching ");

		}else {
			String verify = null;
			System.out.println("enter police id for searching");
			int pid = sc.nextInt();
			for(PoliceData e : pd) {
				if(e.getPol_id() == pid) {
					System.out.println(e.getPol_id() + " " + e.getPol_name() + " " + e.getPol_sal() + " " + e.getPol_age()+ " " + e.getPol_experience()+ " " + e.getPol_gender());
					verify = "found";
					break;
				}
				}if(verify == null) {
					System.out.println("no data available for searching");
			}
		}
				
	}

	
	public void display()
	{
		if(pd.size()==0) {
			System.out.println("no data availabale for displaying");
		}else {
			Iterator itr = pd.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
		
		
	}

}
