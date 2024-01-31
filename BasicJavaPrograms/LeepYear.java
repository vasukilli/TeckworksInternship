import java.util.*;
public class LeepYear 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a year :");
        int year = sc.nextInt();

        int val = (year%400==0)||((year%4==0)&&(year%100 != 0 )) ? 1:0;

        if(val == 1){
            System.out.println(year + " is leep year");
        }else{
            System.out.println(year + " is not leep year");
        }
    }
    
}
