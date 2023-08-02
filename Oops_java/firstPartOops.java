//this is the example for abstraction
//Abstraction = interface + abstract class
package com.OopsConcepts;
/*abstract class shape
{
	String color;
	public abstract double area();
	public abstract String toString();
	shape(String color)
	{
		this.color = color;
	}
	public String getColor()
	{
		return color;
	}
}
class circle extends shape
{
	double radius;
	circle(String color,double radius){
		super(color);
		this.radius=radius;
	}
	public double area()
	{
		return Math.PI*Math.pow(radius, 2);
	}
	public String toString()
	{
		return "the circle color is " + super.getColor() + " radius is " + area();
	}
}
class rectangel extends shape
{
	double length;
	double depth;
	rectangel(String color,double length,double depth){
		super(color);
		this.length=length;
		this.depth = depth;
	}
	public double area()
	{
		return length*depth;
	}
	public String toString()
	{
		return "the rectangle color is " + super.getColor() + " area is " + area();
	}
}

public class firstPartOops {

	public static void main(String[] args) 
	{

       shape c = new circle("blue",4.2);
       shape r = new rectangel("yellow",4.0,8.0);
       System.out.println(c.toString());
       System.out.println(r.toString());

	}

}
//Encapsulation = datahiding + abstraction
class person
{
	private String name;
	private int age;
	public String getName()
	{
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
class firstPartOops
{
	public static void main(String[] args)
	{
		person p = new person();
		p.setName("vasu");
		p.setAge(24);
		System.out.println("name :"+p.getName());
		System.out.println("age :"+p.getAge());
	}
}
class Area
{
	double length;
	double depth;
	Area(double length,double depth){
		this.length = length;
		this.depth=depth;
	}
	public void getArea()
	{
		double area = length*depth;
		System.out.println(" the area is :" + area);
		
	}
}
class firstPartOops
{
	public static void main(String[] args)
	{
		Area a = new Area(12.4,13.5);
		a.getArea();
		
	}
}
class Encapsulate
{
	private String geeksName;
	private int geeksRoll;
	private int geeksAge;
	public String getName()
	{
		return geeksName;
	}
	public int getRoll()
	{
		return geeksRoll;
	}
	public int getAge()
	{
		return geeksAge;
	}
	public void setName(String name) {
		geeksName = name;
	}
	public void setRoll(int roll) {
		geeksRoll = roll;
	}
	public void setAge(int age) {
		geeksAge = age;
	}
	
	
}
class firstPartOops
{
	public static void main(String[] args)
	{
		Encapsulate obj = new Encapsulate();
		obj.setName("vasudeva rao killi");
		obj.setRoll(245);
		obj.setAge(24);
		System.out.println("name :" + obj.getName());
		System.out.println("roll number :" + obj.getRoll());
		System.out.println("age :" + obj.getAge());
	}
}*/
/*class Account
{
	private long acc_num;
	private String name,email;
	private float amount;
	
	public long getAccnum() {
		return acc_num;
	}
	public void setAccnum(long acc_num)
	{
		this.acc_num = acc_num;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public float getAmount()
	{
		return amount;
	}
	public void setAmount(float amount) {
		this.amount=amount;
	}
	
}
class firstPartOops
{
	public static void main(String[] args)
	{
		Account a = new Account();
		a.setAccnum(6301725926l);
		a.setName("vasudeva Rao Killi");
		a.setEmail("vasu123@gmail.com");
		a.setAmount(1000000f);
		System.out.println(a.getAccnum() + "," + a.getName() + "," + a.getEmail() + "," + a.getAmount());
		
		
		
	}
}/*
//Is a relationship is nothing but inheritence , in this we can use exends keyword...
class device
{
	private String device_name;
	public String getName() {
		return device_name;
	}
	public void setName(String device_name)
	{
		this.device_name=device_name;
	}
	public String name()
	{
		return this.device_name + " is a device";
	}
	
}
class firstPartOops extends device
{
	public static void main(String[] args)
	{
		device d = new device();
		System.out.println("the device name is bulb");
		d.setName("bulb");
		System.out.println("device :" + d.getName());
		System.out.println(d.name());
	}
}
*/
//Has a relationship it is known as composition and aggregation
//specific keyword is not there , we can use new keyword to perform this
//code reusability is there
class firstPartOops
{
	private String color;
	private int maxspeed;
	
		public static void main(String[] args) 
		{
			firstPartOops c = new firstPartOops();
			c.setColor("blue");
			c.setSpeed(234);
			c.carinfo();
			rolls r = new rolls();
			r.StartDemo();
		}
	
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	public void setSpeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}
	public void carinfo()
	{
		System.out.println(" the car color is :" + color + " speed is :" + maxspeed);
	}
}
class rolls extends firstPartOops
{
	public void StartDemo()
	{
		Engine r1 = new Engine();
		r1.start();
		r1.stop();
	}
}
class Engine//supported class...
{
	public  void start()
	{
		System.out.println("started..");
	}
	public  void stop()
	{
		System.out.println("stopped...");
	}
}


































