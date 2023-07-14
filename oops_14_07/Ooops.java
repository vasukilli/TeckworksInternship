package com.firstProject;
import java.util.*;
import java.util.ListIterator;
abstract class oops
{
  public abstract void implementation1();
  public abstract void implementation2();
  public abstract void implementation3();
}
 class vasu extends oops
{
	
	
	public void implementation1(int[] arr,int n)
	{
	  System.out.println("display primary array elements");
	  for(int i=0 ; i<n ; i++) {	
		  for(int j=2 ;j<Math.sqrt(arr[i]);j++) {
			  if(arr[i]%2 == 0)
		  System.out.println(arr[i] + " ");
	  }
	  }
	}


	
	public void implementation2(int[] arr,int n)
	{
		System.out.println("for each loop by display the values");
		
		for(int a : arr)
		{
		 System.out.print(a + " ");	
		}
		  }
		

		
	public void implementation3(int[] arr,int n)
	{
		System.out.println("iterator to iteratin the values");
		ArrayList l = new ArrayList();
	    List<int[]> all = Arrays.asList(arr);
		ListIterator itr = (ListIterator) all.iterator();
		while(itr.hasNext()) {
			Integer i = (Integer)itr.next();
			if(i%2==0) {
				l.add(i);
			}
		}
		System.out.println(l);
	   	
	}



	@Override
	public void implementation1() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void implementation2() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void implementation3() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Ooops
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		int[] arr = new int[n];
		System.out.println("enter array elements:");
		for(int i=0 ; i<n ; i++) {
			arr[i] = sc.nextInt();
		}
		vasu v = new vasu();
	
		v.implementation1(arr,n);
		v.implementation2(arr,n);
		v.implementation3(arr,n);
	}
}


