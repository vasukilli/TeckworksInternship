import java.util.Scanner;
public class TemparatureConverter
  {
    public static double celsiusToFahrenheit(double celsius)
    {
      double fahrenheit =((9/5*celsius)+ 32);
      return fahrenheit;
    }
    public static double celsiusToKelvin(double celsius)
    {
      double kelvin = (celsius+273.15);
      return kelvin;
    }
     public static double fahrenheitToCelsius(double fahrenheit)
    {
      double celsius = ((fahrenheit - 32)*5/9);
      return celsius;
    }
     public static double fahrenheitToKelvin(double fahrenheit)
    {
      double kelvin = ((fahrenheit-32)*5/9 +273.15);
      return kelvin;
    }
    public static double kelvinToCelsius(double kelvin)
    {
      double celsius = (kelvin - 273.15);
      return celsius;
    }
     public static double kelvinToFahrenheit(float kelvin)
    {
      double fahrenheit =((kelvin - 273.15)*9/5+35);
      return fahrenheit;
    }
 
    public static void main(String[] args){
      float celsius;
      Scanner sc = new Scanner(System.in);
     System.out.println("temparature convertor : ");
     System.out.println("different temparatures => celcius,kelvin and fahrenheit ");
      
     System.out.println("enter celcius : ");
      double celcius = sc.nextDouble();
      System.out.println("enter kelvin : ");
      double kelvin = sc.nextFloat();
      System.out.println("enter fahrenheit : ");
      float fahrenheit = sc.nextFloat();

      System.out.println("the temparature can be converted into celsius to fahrenheit : " + celsiusToFahrenheit(celsius));
      System.out.println("the temparature can be converted into celsius to kelvin : " + celsiusToKelvin(celsius));
      System.out.println("the temparature can be converted into fahrenheit to celsius : " + fahrenheitToCelsius(fahrenheit));
      System.out.println("the temparature can be converted into fahrenheit to kelvin : " + fahrenheitToKelvin(fahrenheit));
      System.out.println("the temparature can be converted into kelvin to celsius : " + kelvinToCelsius(kelvin));
      System.out.println("the temparature can be converted into kelvin to fahrenheit : " + kelvinToFahrenheit(kelvin));
      
      
    }
  }