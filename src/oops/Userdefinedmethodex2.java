package oops;

class test{
	public static  int add(int n1,int n2) {
		int s;
		s=n1+n2;
		return s;
	} 
}

public class Userdefinedmethodex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=8;
		test obj=new test();
		int c=obj.add(a,b);
		System.out.println("the sum is :"+c);
		
		

	}

}

