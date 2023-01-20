package java_iterator;
import java.util.ArrayList;
import java.util.Iterator;

public class Java_Iterator_Ex2 {

	public static void main(String[] args) {
		ArrayList<Integer>myNum=new ArrayList<Integer>();
		myNum.add(47);
		myNum.add(35);
		myNum.add(11);
		myNum.add(1);
		myNum.add(8);
		myNum.add(5);
		myNum.add(3);
		System.out.println(myNum);
		
	//getting Iterator
		Iterator<Integer> it = myNum.iterator();
		while(it.hasNext()) {
			Integer i=it.next();
			if(i<10) {it.remove();} //using remove() method the numbers less than 10 are removed
		
		}
	   System.out.println(myNum);
		
		

	}

}
