//33) Write a java program to print Fibonacci series up to n terms
import java.util.*;
public class Febannoic
{
    public static void main(String[] args)
    {
         
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      displayFib(n);

    }
    public static void displayFib(int n)
    {
        int first_num = 0;
        int second_num = 1;
        for(int i=0 ; i<=n ; i++){
            int next_el = first_num + second_num;
            System.out.print(next_el + " ");
            first_num = second_num;
            second_num = next_el;
        }
    }
}
