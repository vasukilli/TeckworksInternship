
import java.util.*;
//import java.io.*;
public class vector
{
    public static void main(String[] args){
        int n=5;
        Vector<Integer> v = new Vector<Integer>(n);
        v.add(54);
        v.add(7585);
        v.add(65757);
        v.add(66454);
        v.add(64774757); 
        try{
        for(int i=0;i<=n;i++)
        {
           System.out.println(v.get(i));
        }
        }catch(ArrayIndexOutOfBoundsException e){

        }
        int val = v.remove(3);
        System.out.println("The removed value is "+ val);
        for(int i=0;i<=v.size();i++){
            System.out.print(v.get(i) + " ");
        }
    }
}