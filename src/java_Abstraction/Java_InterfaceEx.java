package java_Abstraction;
//Interfaces:interface is a completely "abstract class" that is used to group related methods with empty bodies:
//Examples:
/*
interface Animal {
  public void animalSound();      // interface method (does not have a body)
  public void run();              // interface method (does not have a body)
} 


To access the interface methods, the interface must be "implemented" (kinda like inherited) by 
another class with the implements keyword (instead of extends). 
The body of the interface method is provided by the "implement" class:
 */
//Example:

interface HiAnimal {
	  public void animalSound(); // interface method (does not have a body)
	  public void sleep(); // interface method (does not have a body)
	}

	class HiPig implements HiAnimal {
	  public void animalSound() {
	    System.out.println("The pig says: wee wee");
	  }
	  public void sleep() {
	    System.out.println("Zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
	  }
	}

	class Java_InterfaceEx {
	  public static void main(String[] args) {
	    HiPig myPig = new HiPig();
	    myPig.animalSound();
	    myPig.sleep();
	  }
	}
