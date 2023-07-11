//17) Write a java program to find frequency of each digit in a given integer.
import java.util.*;
public class DigitFrequency 
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number:");
    int n=sc.nextInt();
    int[] count = countFreq(n);
    for(int digit = 0 ; digit <= count.length ; digit++){
        int frequence = count[digit];
        System.out.println("digit :" + digit + "frequence:" + frequence);
    }
    }
    public static int[] countFreq(int n)
    {
        int[] count = new int[10];//initialize the array with 0 elements
        while(n != 0){
            int dig = n%10;
            count[dig]++;
            n=n/10;
        }
        return count;
    }


    
}
