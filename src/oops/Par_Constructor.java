package oops;
//Java Parameterized Constructor:
/*A constructor which has a specific number of parameters is called a parameterized constructor.
* 
* Why use the parameterized constructor?

  The parameterized constructor is used to provide different values to distinct objects.
  However, you can provide the same values also.
*/

//Example of parameterized constructor:

class Student4{
  int id;
  String name;
  
  Student4(int i,String n){
  id = i;
  name = n;
  System.out.println(id+" "+name);
  }
  
}
class Par_Constructor{
  public static void main(String args[]){
  Student4 s1 = new Student4(231,"Ravi");
  Student4 s2 = new Student4(232,"Kiran");
  
  }
 }

