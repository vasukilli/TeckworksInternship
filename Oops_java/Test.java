package com.OopsConcepts;

/*Abstract modifier implementation
abstract class main
{
	abstract public void m1();
}
class m2 extends main
{
	public void m1()
	{
		System.out.println("jai hindh");
	}
}
class Test
{
	public static void main(String[] args)
	{
		m2 m = new m2();
		m.m1();
		
	}
} */


// instance variables....
/*public class test1
{
	int x;
	char a;
	double d;
	float f;
	String s;// these are all instance varieables...
	long l;
	byte b;
}
class Test extends test1
{
	public static void main(String[] args)
	{
		Test t = new Test();
		System.out.println(t.x);
		System.out.println(t.a);
		System.out.println(t.d);
		System.out.println(t.f);
		System.out.println(t.s);
		System.out.println(t.l);
		System.out.println(t.b);
		test1 t1 = new test1();
		System.out.println(t.x);
		System.out.println(t1.a);
		System.out.println(t1.d);
		System.out.println(t1.f);
		System.out.println(t1.s);
		System.out.println(t1.l);
		System.out.println(t1.b);
		
		
	}
}
class Test
{
	final int x;
	Test()
	{//initialization is must for the final keyword when we can use in instance varieablesss
		x=10;
	}
	public static void main(String[] arg)
	{
		Test t = new Test();
		System.out.println(t.x);
		
	}
	
}
class Test1
{
	static  final int x=20;
}
class Test extends Test1
{
	static final int x=10;
	
	public static void main(String[] args)
	{
		Test1 t1 = new Test1();
		System.out.println(t1.x);
		Test t2 = new Test();
		System.out.println(t2.x);
		
	}
}
class Test
{
	public static void main(String[] args)
	{
		
	public int x=10;
	private int c=10;
	protected int y=10;
	default int a=10;  
	transient int b =10;
	volatile int h =10;
	final int z = 10; //the aplicable modifier for the local variables is final..
	                  //remaining are illegal start of expressions
	
	}
}
class Test
{
	static int x = 20;
	int y = 10;
	public static void main(String[] args)
	{
		Test t1 = new Test();
		t1.x = 888;
		t1.y = 999;
		Test t2 = new Test();
		System.out.println(t1.x + "...." + t1.y);
		System.out.println(t1.x+"..........."+t1.y+"..."+t2.x+"..."+t2.y);
	}
}*/





































