public class Test5 
{
    public static void main(String[] args)
    {
        //public int lastIndexOf(char ch)
        /* 
        String str = new String("welcome to geeksforgeeks");
        System.out.println(str.lastIndexOf('e'));//21 

        //public int lastIndexOf(char ch , int beg)

        String str = new String("welcome to geeksforgeeks");
        int val = str.lastIndexOf('w',23);
        System.out.println(val); */

        //public int lastIndexOf(String str)

        String str = new String("welcome to geeksforgeeks");
        String str1 = "vasu";
        int val = str.lastIndexOf(str1);
        System.out.println(val);

        //public int lastIndexOf(String str , int beg)

        String str2 = new String("geeks for geeks to welcome");
        String str3 = "geeks";
        int val1 = str2.lastIndexOf(str3,5);
        System.out.println(val1);
    }
    
}
