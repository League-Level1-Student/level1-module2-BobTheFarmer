package _01_getters_and_setters;

import javax.swing.JOptionPane;

public class Runner {
	public static void main(String[] args) {
	Person p1 = new Person("name1", "power1");
	Person p2 = new Person("name2", "power2");
	Person p3 = new Person("name3", "power3");
	JOptionPane.showMessageDialog(null,p1.toString());
	}
}
