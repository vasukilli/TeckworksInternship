//1.Rotate array in java
import java.util.*;
public class RotateArray
{
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter aray size");
        int n=sc.nextInt();
        System.out.println("enter aray elements");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("enter order");
        int order = sc.nextInt();

        rotate(arr,order);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        
        
    }
    public static void rotate(int[] arr,int order){
        if(arr==null || arr.length == 0 || order<0){
            throw new IllegalArgumentException("invalid");
        }
        if(order>arr.length){
             order=order%arr.length;
        }
        int a = arr.length-order;

        reverse(arr,0,a-1);
        reverse(arr,a,arr.length-1);
        reverse(arr,0,arr.length-1);
    }
    public static void reverse(int[] arr,int left,int right){
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
       
    }
     
}