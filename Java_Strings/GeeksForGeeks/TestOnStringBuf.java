public class TestOnStringBuf 
{
    public static void main(String[] args)
    {
        /* StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("google!");
        String s =  sb.toString();
        System.out.println(s); */

        //append()..we can add character , string or object at the end of string
        StringBuffer sb = new StringBuffer("vasu");
        sb.append("devaRao");
        System.out.println(sb);

        //insert()..at specified index we can insert the string value
        StringBuffer sb1 = new StringBuffer("helloRao");
        sb1.insert(5," Vasudeva ");
        String message = sb1.toString();
        System.out.println(message);

        //replace(int startend , int endind , String newStr)
        StringBuffer sb2 = new StringBuffer("drakshaayani");
        sb2.replace(0,12,"Amma");
        String val1 = sb2.toString();
        System.out.println(val1);

        //delete(int strtinde , int endind)
        StringBuffer sb3 = new StringBuffer("chandrasekharaRao");
        sb3.delete(0,7);
        String str = sb3.toString();
        System.out.println(str);

        //reverse()
        StringBuffer sb4 = new StringBuffer("sri rajaRajeswasri");
        sb4.reverse();
        String str1 = sb4.toString();
        System.out.println(str1);

        //capacity()
        StringBuffer sb5 = new StringBuffer();
        System.out.println(sb5.capacity());//defaultly it is 16

        StringBuffer sb6 = sb5.append("hello");
        System.out.println(sb6.capacity());//16

        StringBuffer sb7 = sb6.append("my name is vasudeva rao killi from srikakulam");
        System.out.println(sb7.capacity());//50


        






    }
    
}
