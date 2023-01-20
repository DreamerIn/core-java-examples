package Inheritance.src.Hierarchicalinheritance;
class A{
	void input()
	{
		System.out.println("Enter your name:  ");
	}
}
class B extends A{
	void show()
	{
		System.out.println("my name is Ravi");
	}
}
class C extends A{
	void disp()
	{
		System.out.println("my name is Kiran");
	}
}

class Hierarchical {
	public static void main(String args[]) {
		B obj1=new B();
		C obj2=new C();
		
		 obj1.input();
		 obj1.show();
		 obj2.input();
		 obj2.disp(); 
	}

}
