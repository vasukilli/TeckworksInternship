import java.util.*;
public class LengthOfEachWord
  {
    public static void display(String str)
    {
       char[] ch = str.toCharArray();
      System.out.println(ch);
        for (int i = 0; i < ch.length; i++) {
            String s = "";
          while (i < ch.length && ch[i] != ' ')
              {
                s = s + ch[i];
                i++;
            }
 
        if (s.length() > 0)
            System.out.println(s + ":" + s.length());           
        }
    }
 public static void main(String[] ar)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the string:");
      String s1=s.nextLine();
      display(s1);
    }
  }