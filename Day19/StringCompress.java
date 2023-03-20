import java.util.Scanner;
public class StringCompress
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      String s = new String(sc.nextLine());
      char ch[] = new char[s.length()];
      String ans = compress(ch);
      System.out.println(ans);
    }
    public static String compress(char ch[]){
      int count = 0;
      for(int i = 0;i<ch.length;i++){
        for(int j = i+1;j<ch.length;j++){
          if(ch[i]==ch[j]){
            count++;
          }
          //String ans = ch.replace(ch[],count);
        }
        String ans = ch.replace(ch[],count);
      }
      
    }
    return ans;
  }