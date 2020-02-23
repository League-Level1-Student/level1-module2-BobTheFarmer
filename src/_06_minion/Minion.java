package _06_minion;

public class Minion {
	/*

	2.
	 So to make these tests pass, you will first need to create a Minion class with the member variables below:

	  			private String name; 
	  			private int eyes; 
	  			private String color; 
	  			private String master;

	 3.
	  Next, create a constructor, and getters and setters for all the member variables of the Minion class. 
	  If they’re done right, all these tests will pass.
	  
	  To check, run this MinionTest class and the JUnit tab should show a GREEN bar.
	    
	 */
	
	private String name; 
	private int eyes; 
	private String color; 
	private String master;
	
	Minion(String name, int eyes, String color, String master) {
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
	}
	void setName(String name) {
		this.name = name;
	}
	void setEyes(int eyes) {
		this.eyes = eyes;
	}
	void setColor(String color) {
		this.color = color;
	}
	void setMaster(String master) {
		this.master = master;
	}
	
	String getName() {
		return name;
	}
	int getEyes() {
		return eyes;
	}
	String getColor() {
		return color;
	}
	String getMaster() {
		return master;
	}
}
