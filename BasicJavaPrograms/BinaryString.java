//Java Program to Add Two Binary Strings
import java.util.*;
public class BinaryString
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
        System.out.println("enter any binary string value");
        String x = sc.next();
        String y = sc.next();
        String result = BinaryStr(x,y);
        System.out.println(result);
    }
    public static String BinaryStr(String x,String y)
    {
        StringBuilder result = new StringBuilder();
        int i = x.length()-1;
        int j = y.length()-1;
        int carry = 0;
        while(i>=0 || j>=0){
            int sum = carry;
            if(i>=0){
                sum=sum+x.charAt(i)-'0';
            }
            if(j>=0){
                sum=sum+y.charAt(j)-'0';
            }
            if(sum==0 || sum==1){
                result.append(sum);
                carry=0;
            }else if(sum==2){
                result.append("0");
                carry=1;
            }else{
                result.append("1");
                carry=1;
            }
            i--;
            j--;
        }
        if(carry == 1){
            result.append("1");
        }

        return result.reverse().toString();
    }
    
}
