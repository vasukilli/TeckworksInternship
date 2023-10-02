public class Test
{
    public static void main(String[] args)
    {
       /*  String str = new String("geeks");//immutable,fixed in size,sequence of characters
        System.out.println(str); 
        StringBuilder str = new StringBuilder("vasu");//growable nature in size , mutable
        str.append("deva rao");
        System.out.println(str);*/
        String name = "sachin";
        String name1 = name.concat(" tendulkar");
        System.out.println(name1);
    }
}