package Inheritance.src.multilevelInheritance;

class A {
	protected int a=20;
	protected int b=10;
	protected int c;
	
	
	void add()
	{
		
		c=a+b;
		System.out.println("the sum of a and b is:  "+c);
	}
	void sub()
	{
		
		c=a-b;
		System.out.println("the sub of a and b is:  "+c);
	}

}
class B extends A{
	void multi()
	{
		
		c=a*b;
		System.out.println("the multi of a and b is:  "+c);
	}
	void div()
	{
		
		c=a/b;
		System.out.println("the div of a and b is:  "+c);
	}
}
class C extends B{
	void remider()
	{
		c=a%b;
		System.out.println("the remider of a and b is:  "+c);
	}
}
class MultilevelI{
	public static void main(String args[]) {
		C obj=new C();
		obj.add();
		obj.sub();
		obj.multi();
		obj.div();
		obj.remider();
	}
}
