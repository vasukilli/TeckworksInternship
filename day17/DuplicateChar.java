import java.util.Scanner;
public class DuplicateChar
  {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter any string :");
      String s = sc.nextLine();
      displayDuplicateChar(s);
    }
    public static void displayDuplicateChar(String str) 
    {
      System.out.println("Show duplicate characters");
       int[] freq = new int[256];
        for (int i = 0; i <=str.length()-1; i++) {
            char c = str.charAt(i);
            freq[c]=freq[c]+1;
          }
        for (int i = 0; i <freq.length-1; i++) 
        {
            if (freq[i]>1) 
            {
System.out.println("duplicate characters are:"+(char)i);
            }
       }
    }   
  }