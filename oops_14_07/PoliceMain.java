1package com.firstProject;
import java.util.*;
class PoliceMain {

	public static void main(String[] args) 
	{
		PoliceImplementation pim = new PoliceImplementation();
		Scanner sc = new Scanner(System.in);
		PoliceImplementation pi = new PoliceImplementation();
		System.out.println("1.insert police details ");
		System.out.println("2.delete police details ");
        System.out.println("3.search police details ");
		System.out.println("4.display police details ");
		char ch;
		
		do {
			System.out.println("enter the option from 1 to 4 ");
			int val = sc.nextInt();
			switch(val) {
			case 1:pim.insert();
			break;
			case 2:pim.delete();
			break;
			case 3:pim.search();
			break;
			case 4:pim.display();
			break;
			default:System.out.println("enter valid num only");
			
			}
			System.out.println("you want one more option");
			ch = sc.next().charAt(0);
			
		}
		while(ch != 'n');
		System.out.println("close");


		
	}

}
