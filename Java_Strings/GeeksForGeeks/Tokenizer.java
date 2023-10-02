import java.util.StringTokenizer;

public class Tokenizer
{
    public static void main(String[] args)
    {
        //countTokens() and nextToken()

        StringTokenizer str = new StringTokenizer("lets pracice geeks for geeks");
        int count = str.countTokens();
        System.out.println("number of tokens :" + count);
        for(int i=0 ; i<count ; i++)
        {
            System.out.println("str[" +i+ "]" + str.nextToken());
        }
        
    }
    
}
