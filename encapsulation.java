/*
 * ENCAPSULATION IS A MAIN OOP METHOD WHERE VARIABLES OR DATA OF A CLASS IS HIDDEN FROM OTHER CLASSES 
 * CAN BE ACCESED WHEN A FUCTION OF THE CLASS IS DECLARED IN ANOTHER CLASS
 */
package encapsulation;

public class encapsulation {

    public static void main(String[] args) {
	/*
	 * two ways to create class instance of cars
	 * one using default constructor
	 * another using overloaded constructor
	 */
	
	Cars car1= new Cars();
	
	// lets try the overloaded constructor
	Cars car2=new Cars("Honda", "Jazz",2007);
	car1.setMake("Tata");
	car1.setModel("Safari");
	car1.setYear(2022);
	// now try to print the variable value below
	
	//System.out.println(car1.make); // this is not allowed as it is private variable and not visible
	// so we use getters method
	System.out.println(car1.getMake());
	System.out.println(car1.getModel());
	System.out.println(car1.getYear());
	System.out.println();
	System.out.println(car2.getMake());
	System.out.println(car2.getModel());
	System.out.println(car2.getYear());
    }
}