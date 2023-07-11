////3)Write a program to reverse an  string
import java.util.*;
public class Reverse2 
{
    public static void main(String[] args)
    {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter any string");
  String s1 = sc.next();
  char[] ch = s1.toCharArray();
  String nstr = "";
  for(int i=0 ; i<s1.length() ;i++){
    char v = s1.charAt(i);
    nstr = v+nstr;
  }
  System.out.println(nstr);
  
}
}