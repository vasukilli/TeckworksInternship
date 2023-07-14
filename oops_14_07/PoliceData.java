package com.firstProject;

public class PoliceData 
{
	int pol_id;
	String pol_name;
	double pol_sal;
	int pol_age;
	int pol_experience;
	String pol_gender;
	
	PoliceData(int pi , String pn, double ps , int pa , int pe , String pg)
	{
		pol_id = pi;
		pol_name = pn;
		pol_sal = ps;
		pol_age = pa;
		pol_experience = pe;
		pol_gender = pg;
	}
	public int getPol_id() {
		return pol_id;
	}
	public String getPol_name() {
		return pol_name;
	}
	public double getPol_sal() {
		return pol_sal;
	}
	public int getPol_age() {
		return pol_age;
	}
	public int getPol_experience() {
		return pol_experience;
	}
	public String getPol_gender() {
		return pol_gender;
	}
	public String toString() {
		return pol_id + " " + pol_name + " " + pol_sal + " " + pol_age + " " + pol_experience + " " + pol_gender;
	}
	

}
