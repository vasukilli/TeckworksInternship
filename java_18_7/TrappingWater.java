import java.util.*;
public class TrappingWater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		int[] arr = new int[n];
		System.out.println("enter array elements");
		for(int i=0 ; i<n ; i++) {
			arr[i] = sc.nextInt();
			System.out.print(arr[i] + " ");
		}
		int result = findTrapping(arr,n);
		System.out.println(result);
		
	}
	public static int findTrapping(int[] arr,int n)
	{
		int result = 0;
		int[] left = new int[n];
		int[] right = new int[n];
		left[0] = arr[0];
		for(int i=1;i<n;i++) {
			left[i]= Math.max(left[i-1],arr[i]);
		}
		right[n-1]=arr[n-1];
		for(int i=n-2;i>=0;i--) {
			right[i]=Math.max(right[i+1],arr[i+1]);
		}
		for(int i=0 ; i<n ; i++) {
			result = result + (Math.min(left[i],right[i])-arr[i]);
		}
		return result;
	}

}
