import java.util.*;
public class CompoundIntrest 
{
    public static void main(String[] args)
    {
        double p = 1000 , t = 2, r = 50;
        double result = p * Math.pow((1 + r/100),t);
        System.out.println("the compound intrest is :" + result);
    }
    
}
