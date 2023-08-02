package com.OopsConcepts;

/*interface printable//in interface we can use implements keyword...
{
	
	void print();//here it can be defaultly take abstract and public keywords
}
public class ImplementationInterfce implements printable
{
    public void print()//here compulsary declare method as a public
    {
    	System.out.println("hello java");
    }
	public static void main(String[] args) 
	{
		ImplementationInterfce ii = new ImplementationInterfce();
		ii.print();

	}

}
interface drawable//it is not super class thats why we cants use extend keyword
{
	 void draw();
}
class circle implements drawable
{
	public void draw()
	{
		System.out.println("circle drawing");
	}
}
class rectangle implements drawable
{
	public void draw()
	{
		System.out.println("rectangle drawing");
	}
}
class ImplementationInterfce
{
	public static void main(String[] args)
	{
		drawable c = new circle();
		c.draw();
		drawable r = new rectangle();
		r.draw();
	}
}
interface Bank
{
	float gstCost();
}
class SBI implements Bank
{
	public float gstCost()
	{
		float a = 10.0f;
		float b = 9.3f;
		return (a+b);
	}
}
class PNB implements Bank
{
	public float gstCost()
	{
		float a = 20.0f;
		float b = 90.3f;
		return (a+b);
	}
}
class ImplementationInterfce
{
	public static void main(String[] args)
	{
		Bank s = new SBI();
		System.out.println(s.gstCost());
		Bank p = new PNB();
		System.out.println(p.gstCost());
	}
}/*
interface portable//multiple interfaces
{
	void print();
}
interface showable
{
	void show();
}
public class ImplementationInterfce implements portable,showable
{
	public void print() {
		System.out.println("printable method");
	}
	public void show() {
		System.out.println("showable method");
	}
	public static void main(String[] args) {
		ImplementationInterfce ii = new ImplementationInterfce();
		ii.print();
		ii.show();
	}
}
interface A//In the interface we can declare variables , the modifiers are publick,static and final ony acceptable
{
	int x = 10;
	public static  int y = 20;
	static int z = 30;
	final int a = 40;
	public static int b = 50;
	static final int c = 60;
	public static final int d = 70;
	
}
//Method Naming Conflits
interface A//if same method signatures and return values on that time we cant run the java class
{
	public void m1();
}
interface B
{
	
	void m1();
}
class ImplementationInterfce implements A,B
{
	public void m1()
	{
		System.out.println("hi vasu");
	}
	
	public static void main(String[] args)
	{
		ImplementationInterfce ii = new ImplementationInterfce();
		ii.m1();
		
	}
}
//varieable naming conflits
interface A
{
	int x = 888;
}
interface vasu
{
	int x = 999;
}
class ImplementationInterfce implements A,vasu
{
	public static void main(String[] arfs)
	{
		//System.out.println(x);//here we get ambiguty problem
		System.out.println(A.x);
		System.out.println(vasu.x);
	}
}*/
//construcctors...
class person
{
	String name;
	int age;
	person(String name,int age){
		this.name = name;
		this.age = age;
	}
}
class Student extends person
{
	int marks;
	String vlg;
	Student(String name,int age,int marks,String vlg){
		super(name,age);//parent class instance variables covert into constructor this is accepted....
		this.marks = marks;
		this.vlg = vlg;
	}
}
class ImplementationInterfce
{
	public static void main(String[] args)
	{
		Student s = new Student("vasu",21,10220,"ptpalli");
		
	}
}


















































