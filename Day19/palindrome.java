import java.lang.*;
public class palindrome
  {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      //StringBuffer sb = new StringBuffer(str);
      String r = displayPalindrom(str);
      System.out.println(r);
    }
    public static String displayPalindrom(String sb){
            String a[] = sb.split(" ");
            String r ="";
            for(int i = 0;i<=a.length-1;i++){
              String a1 = a[i];
              for(int j=a1.length()-1;j>0;j++){
                r = r + a1.charAt(j);
              }
            }
      return r;
    }
  }