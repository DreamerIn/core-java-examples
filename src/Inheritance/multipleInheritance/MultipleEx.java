package Inheritance.src.multipleInheritance;

interface C {
	void show();      //public+abstract
    //abstract methods doesn't have body.
}
interface D{
	void show();      //public+abstract
}
class MultipleEx implements C,D{
	public void show(){
		System.out.println("the interface C ");
		System.out.println("the interface D ");
	}
	
	public static void main(String args[]) {
        MultipleEx obj=new MultipleEx();
		obj.show();
		
		
	}
}
