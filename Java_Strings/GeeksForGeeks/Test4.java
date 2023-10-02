public class Test4
{
    public static void main(String[] args)
    {
        String str ="aeiouAEIOU";
        boolean isVal = isVowel(str,'z');
        if(isVal)
        {
            System.out.println("vowel");
        }else{
            System.out.println("consonent");
        }

    }
    public static boolean isVowel(String str,char c)
    {
        return str.indexOf(c)>=1;

    }
    
}
