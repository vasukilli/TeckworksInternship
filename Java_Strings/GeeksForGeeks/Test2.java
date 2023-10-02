public class Test2 
{
    public static void main(String[] args)
    {
        //1.int n = str.length();
        /* char[] ch = {'G','F','G'};
        String str1 = new String(ch);
        System.out.println(str1);
        String str2 = new String(str1);
        System.out.println(str2); 
        String str ="welcome";
        int n = str.length();
        char ch;
        int count=0;
        for(int i=0 ; i<n;i++){
           // ch = str.charAt(i);
            // System.out.print(ch + " ");
            if(str.charAt(i)=='e')
            {
                count++;
            }

        }
        //2.public char charAt(int index);
        System.out.println("count is :" + count);
        System.out.println();
        System.out.println("even positions:");
        for(int i=1;i < n;i=i+2){
            ch = str.charAt(i);
            System.out.print(ch + " ");
        }
        System.out.println();
        System.out.println("odd position:");
        for(int i=0;i<n;i=i+2){
            ch=str.charAt(i);
            System.out.print(ch + " ");
        }
     */
    //public String substring(int index);
    String str = new String("welcome to geeksforgeeks");
    String newStr = str.substring(8);
    System.out.println(newStr);

    String newStr1 = str.substring(2,15);
    System.out.println(newStr1);
        
      
    }
}
