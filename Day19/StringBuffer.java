import java.lang.StringBuffer;
public class StringBuffer
  {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("string :");
      String str = sc.nextLine();
      StringBuffer sb = new StringBuffer(str);

      String ins = insert(str);
      System.out.println(ins);

       String ap = append(str);
      System.out.println(ap);

       String rep = replace(str);
      System.out.println(rep);

       String del = delete(str);
      System.out.println(del);
       String rev = reverse(str);
      System.out.println(rev);
      
      
    }
    public static String insert(String str){
     String ins = sb.insert(1,"Hello");
      return ins;
    }
    public static String append(String str){
     String ap = sb.append("vasu");
      return ap;
    }
    public static String replace(String str){
     String rep = sb.replace(1,3,"Hello");
      return rep;
    }
    public static String delete(String str){
     String del = sb.delete(1,3);
      return del;
    }
    public static String reverse(String str){
     String rev = sb.reverse();
      return rev;
    }
  }