package oops;
/*
 * Abstract Method:
                   The method that does not has method body is known as abstract method. 
                   In other words, without an implementation is known as abstract method. 
                   It always declares in the abstract class. 
                   It means the class itself must be abstract if it has abstract method. 
                   To create an abstract method, we use the keyword abstract.
 */

abstract class arithmetic_operation
{
abstract void printInfo();
}
class add extends arithmetic_operation
{
	void printInfo ()
	{
		int a = 3;
		int b= 4;
		System.out.println(a+b);

	}
}
class sub extends arithmetic_operation
{
	void printInfo()
	{
		int c=4;
		int d=5;
		System.out.println(c-d);
	}
}
class AbstractMethod
{
	public static void main(String args[])
	{
		arithmetic_operation n = new add();
		n.printInfo();
		arithmetic_operation y = new sub();
		y.printInfo();
	}
}
