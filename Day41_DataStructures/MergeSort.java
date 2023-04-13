import java.util.*;
class MergeSort
{
public static void mergeSort(int[] a, int n) 
  {

if (n < 2) 
{

return;
}

int mid = n / 2;

int[] l = new int[mid];
int[] r = new int[n - mid];
for (int i = 0; i < mid; i++) 
{

l[i] = a[i];

}
for (int i = mid; i < n; i++) 
{
r[i - mid] = a[i];
}
mergeSort(l, mid);
mergeSort(r, n - mid);
merge(a, l, r, mid, n - mid);
}

public static void merge(
int[] a, int[] l, int[] r, int left, int right) 
  {

int i = 0, j = 0, k = 0;
while (i < left && j < right) 
{
if (l[i] <= r[j]) 
{
a[k++] = l[i++];
}
else 
{
a[k++] = r[j++];
}
}
while (i < left) 
{
a[k++] = l[i++];
}
while (j < right) 
{
a[k++] = r[j++];
}

}
public static void main(String[] args)

{
int n;
System.out.println("Enter number of elements in an array");
Scanner w=new Scanner(System.in);
n=w.nextInt();
int arr[]=new int[n];
System.out.println("Enter elements");
for(int i=0;i<n;i++)

arr[i]=w.nextInt();
System.out.println("Before sorting");

for(int i=0; i<arr.length; i++)

{
System.out.print(arr[i]+" ");
}
mergeSort(arr,n);
System.out.println("After soring");
for (int i=0; i<arr.length; ++i)
{
System.out.print(arr[i]+" ");
}
}

}