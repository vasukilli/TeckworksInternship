package com.OopsConcepts;
import java.util.*;
// Trapping water problem by using protected modifier...
public class TrappingWater 
{
	public static void main(String[] args)
	{
	imp im = new imp();
	
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array size:");
    int n=sc.nextInt();
    int[] arr = new int[n];
    System.out.println("enter array elements :");
    for(int i=0 ; i<n;i++) 
    {
	   arr[i]=sc.nextInt();
	   System.out.print(arr[i] + " ");
    }
    int res = im.implimentation(arr,n);
    System.out.println("the result value is :" + res);
	}
   
}
/*
 * protected = <default> + child classes
 * default ...within that package only we can implement the code,
 * child classes can do implementation*/
class imp extends TrappingWater
{
	protected int implimentation(int[] arr,int n)
	{
		int res = 0;
		int[] left = new int[n];
		left[0]=arr[0];
		for(int i=1 ; i<n ;i++) {
			left[i] = Math.max(left[i-1],arr[i]);
		}
		int[] right = new int[n];
		right[n-1]=arr[n-1];
		for(int i=n-2 ;i>=0 ;i--) {
			right[i]=Math.max(right[i+1], arr[i+1]);
		}
		for(int i=0 ; i<n ; i++) {
			res = res + Math.min(left[i],right[i])-arr[i];
		}
		
		return res;
	}
}
