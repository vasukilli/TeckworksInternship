package com.firstProject;
import java.util.*;
public class first 
{
 int[] arr = new int[10];
 int n=arr.length;
 Scanner sc = new Scanner(System.in);
 void display()
 {
	 System.out.println("enter array elements:");
	 for(int i=0;i<n;i++) {
		 arr[i]=sc.nextInt();
		 System.out.print(arr[i] + " , ");
		 
	 }
	 System.out.println();
 }
  void arrayVal(int[] arr, int n)
 {
	 System.out.println("this is the array elements");
	 int[] temp = new int[10];
	 for(int i=0; i<n;i++) {
		 temp[i]=arr[i];
	 
	
		 System.out.print(temp[i] + "-");
	 }
	
 }
}
