package com.OopsConcepts;
/*class A
{
	 void show()
	{
		System.out.println("parent class show method");
	}
}
class B extends A
{
	 void show()
	{
		System.out.println("child class show method");
	}
}

class thirdPartOops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.show();
		B b = new B();
		b.show();
	
		

	}

}*/
/*
class parent
{
	private void m1()
	{
		System.out.println("child m1()");
	}
	protected void m2()
	{
		System.out.print("child m2()");
	}
}
class child extends parent
{
	private void m1()
	{
		System.out.println("parent m1()");
	}
	public void m2()
	{
		System.out.println("parent m2()");
	}
}
public class thirdPartOops
{
	public static void main(String[] args)
	{
		parent p = new parent();
		p.m2();
		parent p1 = new child();
		p1.m2();
	}
}

//the overriding concept , in this method will give different types of return values
class Super
{
	public Object method()
	{
		System.out.println("super method");
		return new Object();
	}
}
class child extends Super
{
	public String method()
	{
		System.out.println("child method");
		return "hello";
	}
}
class thirdPartOops
{
  public static void main(String[] rgs)
  {
	Super s = new Super();
	s.method();
	child c = new child();
	c.method();
}
}
class parent 
{
	public void show()
	{
		System.out.println("parent show()");
	}
}
class child extends parent
{
	public void show()
	{
		super.show();
		System.out.println("child show()");
	}
}
class thirdPartOops
{
	public static void main(String[] args)
	{
		parent p = new parent();
		p.show();
		child c = new child();
		c.show();
	}
}
//if child class have any checked exception compulsary parent have same exception only otherwise we get complile time error
class parent
{
	void m1()
	{
		System.out.println("parent m1()");
	}
	void m2() throws Exception
	{
		System.out.println("parent m2()");
	}
}
class child extends parent
{
	void m1() throws ArithmeticException//this is unchecked exception problem is not there
	{
		System.out.println("child m1()");
	}
	void m2() throws Exception//this is checked exception so problem is thewre
	{
		System.out.println("child m2()");
	}
}
class thirdPartOops
{
	public static void main(String[] args)
	{
		parent p = new parent();
		p.m1();
		child c = new child();
		c.m1();
		
	}
}*/
//method hiding ... we can implement this mathods with static keyword the method signature must be same
/*class parent
{
	public static void f1()//method hiding...
	{
		System.out.println("parent class method");
	}
}
class child extends parent
{
	public static void f1()
	{
		System.out.println("child class method");
	}
}
class thirdPartOops
{
	public static void main(String[] args)
	{
		parent p = new parent();
		p.f1();
		child c = new child();
		c.f1();
	}
}

//tightly coupling
class parent 
{
	child c = new child();
	public void display()
	{
		c.update();
	}
}
class child//tightly coupling....
{
	public void update()
	{
		System.out.println("this is update method");
	}
}
public class thirdPartOops
{
	public static void main(String[] args)
	{
		parent p = new parent();
		p.display();
	}
}*/
class Box//this is one property
{
	public int volume;
	Box(int length , int depth ,int height){
		this.volume = length*depth*height;
	}
}
class thirdPartOops//another property
{
	public static void main(String[] args)
	{
		Box b = new Box(5,5,5);
		System.out.println(b.volume);
		
	}
}





























