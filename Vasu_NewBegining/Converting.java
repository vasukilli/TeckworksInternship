import java.util.*;
public class Converting
{
    private static final String[] dig = {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteeen","founteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
    private static final String[] tens = {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty","twenty"};
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        String decla = convertNumberToWords(n);
        System.out.println(n +":" + decla);
    }
    public static String convertNumberToWords(int n)
    {
        if(n==0){
            return "zero";
        }
        if(n<0){
            return "minus" + convertNumberToWords(Math.abs(n));
        }
        
        if((n/ 1000000000)>0){
            return convertNumberToWords(n/1000000000) + " billion " + convertNumberToWords(n% 1000000000);
        }
        if((n/ 1000000)>0){
            return convertNumberToWords(n/1000000) + " million " + convertNumberToWords(n%1000000);
        }
        if((n/1000)>0){
            return convertNumberToWords(n/1000) + " thousand " + convertNumberToWords(n%1000);
        }
        if((n/100)>0){
            return convertNumberToWords(n/100) + " hundred " + convertNumberToWords(n%100);
        }
        if(n<20){
            return dig[n];
        }else{
            return tens[n/10] + " " + dig[n%10];
        }

    }
}