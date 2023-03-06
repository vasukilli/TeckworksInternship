import java.util.Scanner;
public class Sec3program7
  {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str = new String();
    System.out.println("enter any string:");
    str=sc.nextLine();
    display(str);
  }
    static void display(String str){
      int count =0;
      int max_count=0;
      char maxchar  = arry[0];
      char ch[] =str.toCharArray();
      for(int i=0;i<ch.length;i++){
        for(int j=0;j<ch.length;j++){
          if(array[maxcount>0]){
          if(max_count<count){
            max_count=count;
            maxchar = array[i];
          }
        }
      }
      for( i=0;i<array.length;i++){
        if(array.length>0){
          System.out.println("YES");
        }  else{
          System.out.println("NO");
        }
      }
    }
}