public class Test1 
{
    public static void main(String[] args)
    {
        byte[] ascii = {71,70,71};
        String firststring = new String(ascii);
        System.out.println(firststring);

        String secondstring = new String(ascii,0,3);//here offset indicate the starting character for string in the 
        // ascii byte array and length indicate specifies the length of the string .
        System.out.println(secondstring);
    }
    
}
