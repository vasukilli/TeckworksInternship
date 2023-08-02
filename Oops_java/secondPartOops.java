package com.OopsConcepts;
/*this is method overloading , here method names are same but the arguments of the methods are different
public class secondPartOops 
{
    public int sum(int x,int y) {
    	return (x+y);
    }
    public double sum(double a,double b,double c) {
    	return (a+b+c);
    }
    public float sum(float f,float g,float k) {
    	return (f-g-k);
    }
	public static void main(String[] args) 
	{
		
		secondPartOops so = new secondPartOops();
		System.out.println(so.sum(50, 50));
		System.out.println(so.sum(3.12, 2.6,5.6));
		System.out.println(so.sum(43f,56f,78f));
		
	}

}
class product
{
	public int multiply(int b,int a) {
		int prod = a*b;
		return prod;
	}
	public int multiply(int a,int b,int c) {
		int prod = a*b*c;
		return prod;
	}
}
class secondPartOops
{
	public static void main(String[] args)
	{
		product p = new product();
		int prod1 = p.multiply(20,30);
		System.out.println(prod1);
		int prod2 = p.multiply(10,20,30);
		System.out.println(prod2);
	}
}*/
class student
{
	public void details(String name , int roll_num)
	{
		System.out.println("name :" + name + " roll num " +roll_num);
	}
	public void details(int roll_num,String name) {
		System.out.println("roll_num :"+ roll_num + "name :" + name);
	}
}
public class secondPartOops
{
	public static void main(String[] args)
	{
		student s = new student();
		s.details("vasu",548);
		s.details(562, "anil");
	}
}






























