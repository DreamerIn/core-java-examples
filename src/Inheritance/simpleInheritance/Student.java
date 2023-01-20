package Inheritance.src.simpleInheritance;

class Student {     //superclass
	protected int roll,marks;
	public String name;
	protected void input()
	{
		System.out.print("enter roll no,marks and name: ");
	}
}

class Ravi extends Student{ //subclass
	
	protected void show()
	{
		roll=1;name="ravi";marks=85;
		System.out.println(roll+" , "+marks+" , "+name);
	}
	public static void main(String args[]) {
		Ravi q=new Ravi();
		q.input();
		q.show();
	}
	
}

	

	
