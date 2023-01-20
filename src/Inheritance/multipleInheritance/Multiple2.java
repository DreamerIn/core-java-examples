package Inheritance.src.multipleInheritance;

interface A {
	void show();      //public+abstract
    //abstract methods doesn't have body.
}
interface B{
	void disp();      //public+abstract
}
class Multiple2 implements A,B{
	public void show(){
		System.out.println("the interface A ");
	}
	public void disp(){
		System.out.println("the interface B ");
	}
	public static void main(String args[]) {
        Multiple2 obj=new Multiple2();
		obj.show();
		obj.disp();
		
	}
}
