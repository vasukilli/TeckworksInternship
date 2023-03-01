import java.util.*;
public class MaximumCount
  {
    public static void display(String str)
    {
       int[] freq = new int[256];
        for (int i = 0; i <=str.length()-1; i++) {
            char c = str.charAt(i);
            freq[c]=freq[c]+1;
        }
  
        int max=-1;  
       char maxc=' ';
for(int i=0;i<=str.length()-1;i++)
  {
if(max < freq[str.charAt(i)]) 
    {
        max = freq[str.charAt(i)];  
        maxc =str.charAt(i);   
    }

  }
 
System.out.print("Maximum occurring character: " + maxc);  
}
public static void main(String[] ar)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the string:");
      String s1=s.nextLine();
      display(s1);
    }
  }