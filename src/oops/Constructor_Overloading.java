package oops;
//Constructor Overloading in Java:

/*Constructor overloading in Java is a technique of having more than one constructor with different parameter lists.
  They are arranged in a way that each constructor performs a different task. 
  They are differentiated by the compiler by the number of parameters in the list and their types. */

class Student5{
    int id;
    String name;
    int age;
    Student5(int i,String n){
    id = i;
    name = n;
    }
    Student5(int i,String n,int a){
    id = i;
    name = n;
    age=a;
    }
    void display(){System.out.println(id+" "+name+" "+age);}
}

public class Constructor_Overloading {
	public static void main(String args[]){
	    Student5 s1 = new Student5(1,"Ravi");
	    Student5 s2 = new Student5(2,"Kiran",22);
	    s1.display();
	    s2.display();
	   }
}


