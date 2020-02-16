package _01_getters_and_setters;

import javax.swing.JOptionPane;

public class Person {
	String name;
	String superpower;
	Person(String name, String superpower) {
		this.name = name;
		this.superpower=superpower;
	}
	
	String getName() {
		return name;
	}
	String getSuperpower() {
		return superpower;
	}
	
	void setName(String name) {
		this.name = name;
	}
	void setSuperpower(String superpower) {
		this.superpower = superpower;
	}
	void toString() {
		JOptionPane.showMessageDialog(null, "no");
		
		
	}
}
