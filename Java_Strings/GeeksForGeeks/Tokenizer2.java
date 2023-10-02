import java.util.StringTokenizer;

public class Tokenizer2
{
    //countTokens() , nextToken() , hasMoreTokens()
    public static void main(String[] args)
    {
        StringTokenizer str = new StringTokenizer("lets start with geeks for geeks");
        int count = str.countTokens();
        System.out.println("the number of tokens are :" + count);
        while(str.hasMoreTokens())
        {
            System.out.println("the next token is " + str.nextToken());
        }
        StringTokenizer str1 = new StringTokenizer("");
        System.out.println(str1.countTokens());
        System.out.println(str1.hasMoreTokens());
    }
    
}
