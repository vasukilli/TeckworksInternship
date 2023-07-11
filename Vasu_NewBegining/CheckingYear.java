//6) Write a java program to check whether a year is leap year or not.
import java.util.*;
public class CheckingYear 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter year");
        int year = sc.nextInt();
        if(isLeepYear(year)){
            System.out.println(year + " this is leep year");
        }else{
            System.out.println(year + " this is not a leep year");
        }
    }
    public static boolean isLeepYear(int year){
        if(year%4 != 0){
        return false;
        }else if(year%4 == 0 && year%100 != 0){
            return true;
        }else{
            return false;
        }
        //return false;
    }
}
