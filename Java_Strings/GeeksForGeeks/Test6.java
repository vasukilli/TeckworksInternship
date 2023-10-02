public class Test6
{
    public static void main(String[] args)
    {
        // public boolean equalsIgnoreCase()
        /* 
        String str1 = new String("GeeKS FOr gEEks");
        String str2 = new String("geeks for geeks");
        String str3 = new String("geeksforgeeks");
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str2.equalsIgnoreCase(str3));

        
        //public int compareTo() it returns integer type of data that is +1,-1 or 0 only
        String str1 = new String("geeks for geeks");
        String str2 = new String("GEEKS FOR GEEKS");
        String str3 = "vasudeva rao";
        String str4 = "vasudeva rao"; 
        
        System.out.println(str1.compareTo(str2));
        System.out.println(str3.compareTo(str2));
        System.out.println(str3.compareTo(str4));
        System.out.println("vasu".compareTo("vasu"));

        
        String str1 = "geeKS";
        String str2 ="vasu";
        int val = str1.compareToIgnoreCase(str2);
        System.out.println(val);

        
        //public String toLowerCase()
        //public String toUpperCase()
        String str1 = "DEVA";
        String str2 = "vasu";
        String str3 = str2.toUpperCase();
        String str4 = str1.toLowerCase();
        System.out.println(str3 + " " + str4); 

        //public String trim()
        String str = "  welcome to geeks for geeks official    ";
        System.out.println("str length :" + str.length());
        System.out.println(str);

        String str1 = str.trim();
        System.out.println("str1 length :" + str1.length());
        System.out.println(str1); 

        //public String replace(char old,char new)
        String str1 = new String("GeeKS FOr gEEks");
        String str2 = str1.replace('e','z');
        System.out.println(str2);

        //public String replace(String oldobj , String newObj)

        String str3 = new String("geeks for geeks");
        String str4 = str3.replace("geeks","gfg");
        System.out.println(str4); 
       

        //public CharSequence subSequence(int beg , int end) like substring(int beg , int end)

        String str = new String("welcome to geeks for geeks");
        System.out.println(str.subSequence(0,10));

        //public boolean contains(CharSequence sequence);

        String str1 = new String("gfg for gfg");
        System.out.println(str1.contains("GFG"));  
        */
        //public boolean endsWith(String stuf)
        String str = new String("welcome to geeks for geeks");
        System.out.println(str.endsWith("geeks"));
         System.out.println(str.endsWith("for"));
        









    }
    
}
