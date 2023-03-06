import java.util.Scanner;
public class program6
  {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter ticket:");
      
      String s=sc.next();
      int n = s.length();
      char[] ch = new char[n];
      displayString(s,n,ch);
    }
    public static void displayString(String s,int n,char[] c){
      
       c = s.toCharArray();
      for(int i=0;i<c.length;i++){
        if(charAt(i)>='A' && charAt(i)<='Z'){
             if(c[i]==c[i+1]){
               continue;
             
          System.out.println("YES");
             }else{
               System.out.println("NO");
             }
          
          }
        }
        
      }
      
  }