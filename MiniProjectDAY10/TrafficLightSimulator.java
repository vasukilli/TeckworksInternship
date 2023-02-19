import java.util.Scanner;
public class TrafficLightSimulator
  {
    public static void main(String[] args){
      System.out.println("the traffic colour indicators:");
      Scanner sc = new Scanner(System.in);
      System.out.println("enter traffic flow : ");
      String flow = sc.next();
      System.out.println("enter time for waiting in trafic :");
      float time = sc.nextFloat();

      //if(flow == "high"){
        
        if(time>=0 && time<=20){
          System.out.println("Red light activated");
          System.out.println("STOP the vehicle");
          }
      //}else if(flow == "low"){
        if(time>=20 && time<=40){
           System.out.println("orange light activated");
          System.out.println("ready to ride");
          }
     // }else if(flow == "normal"){
        if(time>=40 && time<=60){
           System.out.println("green light activated");
          System.out.println("go forward");
          }
     // }else{
       // System.out.println("no traffic available");
      }
    }


        
      
      
      
        
     