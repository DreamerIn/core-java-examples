package user_defined_datatypes;
import java.util.HashSet;

public class Java_HashSet_Ex2 {

	public static void main(String[] args) {
		HashSet<Integer>EvenNum=new HashSet<Integer>();
		EvenNum.add(2);
		EvenNum.add(4);
		EvenNum.add(6);
		EvenNum.add(8);
		EvenNum.add(10);
		System.out.println(EvenNum);
		
		for(int i=0;i<11;i++) {
			if(EvenNum.contains(i)) {System.out.println(i+ " :is in the HashSet");
		}else {System.out.println(i+ " :isn't in the HashSet");}
		}
	}

}


