//Evaluate Reverse polish Notation
import java.util.*;
public class RiversePolish 
{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();
        String[] tokens = new String[n];
        System.out.println("enter array elements");
        for(int i=0 ; i<n ; i++){
            tokens[i]=sc.next();
            System.out.print(tokens[i] +" ");
        }
        System.out.println();
       int val= calculatePolish(tokens,n);
       System.out.println("the value is " + val);
        //calculate(num1,num2,token);
    }
    public static int calculatePolish(String[] tokens,int n){
        Stack<Integer> st = new Stack<>();
        for(String token:tokens){
            if("*".equals(token)||"+".equals(token)||"-".equals(token)||"%".equals(token)||"/".equals(token))
            {
                int num1 = st.pop();
                int num2 = st.pop();
                st.push(calculate(num1,num2,token));
                

            }else{
                st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }
    public static int calculate(int num1,int num2,String token){
        int val=0;
        if("*".equals(token)){
            val=num1*num2;
        }
        if("+".equals(token)){
            val=num1+num2;
        }
        if("-".equals(token)){
            val=num1-num2;
        }
        if("/".equals(token)){
            val=num1/num2;
        }
        return val;
    }
    
}
