//get the minimum length from given string
import java.util.Scanner;
class StringTest
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter string:");
      String s = sc.nextLine();
      //Char[] ch = s.toCharArray();
      int n = display(s);
      System.out.println(n);
    }
    public static int display(String s)
    {
      int count = 0;
      for(int i=0;i<s.length();i++){
        if(s.charAt(i) != ' '){
          count++;
        }
        int temp=count;
      }
      int count1=0;
      for(int j=s.length()-1;j>=0;j--){
        if(s.charAt(j) == ' '){
          count1++;
        }
        int temp1=count1;
      }
      if(temp>temp1){
        return temp1;
      }else{
        return temp;
      }
        
        
      }
}