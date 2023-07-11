//9) Write a java program to input any character and check whether it is alphabet(a to z and A to Z), digit(0 TO 9) or special character
import java.util.*;
public class checkingChar
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any character:");
        char ch = sc.next().charAt(0);
        if(isAlphabet(ch)){
            System.out.println(ch + " this is alphabet");
        }else if(isDigit(ch)){
            System.out.println(ch + " this is digit");
        }else{
            System.out.println(ch + " this is special character");
        }
    }
    public static boolean isAlphabet(char ch){
        boolean t = ((ch >= 'A'&& ch <= 'Z') ||(ch >= 'a'&& ch <= 'z'))? true : false;
        return t;
    }
    public static boolean isDigit(char ch){
        boolean t = (ch >= '0' && ch <= '9')? true : false;
        return t;
    }

}