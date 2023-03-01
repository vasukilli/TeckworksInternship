import java.util.Scanner;
public class StringEx
  {
    public static void main(String[] args){
      String string = new String();
      Scanner s = new Scanner(System.in);
      System.out.println("give the data to ");
      string = s.nextLine();
      System.out.println(string);
      //retriving few characters from string
      //stringObject.CharAt(0);
      System.out.println(string.charAt(2));
      //retriving words from string
      //by using split method
      System.out.println(string.split(""));
      String stringarry[] = string.split("");
      for(int i=0 ; i<stringarray.length ; i++){
        System.out.println(stringarray[i]);

        //1.length();
        //System.out.println(string.length());
        int len = string.length();
        System.out.println(len);
        //2.concat();
        System.out.println(string.concat("hai"));
        String s1 = "hello";
        System.out.println(string.concat(s1));
        
        //3.+ operator
        System.out.println(string + "hai");
        //4.toSting();
        System.out.println(string.toString());
        StringExample se = new StringExample();
        System.out.println(se.toString());


        //character extraction methods..
        //4.1 charAt();
        System.out.println(string.charAt(3));
        //4.2 getChar();
        char p[] = new char[10];
        string.getChars(3,7,p,1);
        System.out.println(p);
        for(int i = 0 ;i<p.length;i++){
          System.out.println(p[i]);

          //4.3 getBytes
          byte b[] = string.getBytes();
          for(int i = 0 ;i<b.length ; i++){
            System.out.println(b[i]);
        
          }
          //4.4 getCharArray
          char ch[] = string.getCharArray();
          for(int i = 0 ; i<ch.length;i++){
            System.out.println(ch[i]);
            
          }

          //String comparision methods..
         
          // compareTo()
          String string2 = new String(scanner.nextLine());
          System.out.println(string.compareTo(string2));
          //equals().....true/false
          System.out.println(string.equals(string2));

          //==....true/false
          System.out.println(string == string2);

          //startsWith()
          System.out.println(string2.startsWith("1"));
          

          //endsWith()
          System,out.println(string2.endsWith("&"));

          //equasIgnoreCase();
          System.out.println(string2.equalsIgnoreCase(string));


          //searching for some patterns
          //1.indexOf()
          System.out.println(string2.indexOf("of"));
          System.out.println(string2.indexOf('z'));
          System.out.println(string2.lastIndexOf('z',5));
          System.out.println(string2.lastIndexOf("of",6));

          //toLowerCase();
          System.out.println(string.toLowerCase());
          System.out.println(string.toUpperCase());

          //substring()
          System.out.println(string.substring(2));
          //replace()
          System.out.println(string.replace('e',78));
        }
        
    
      }
      
    }
  }