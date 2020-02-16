package _01_getters_and_setters;

public class Taco {
	String meat;
	String sause;
	Taco(String meat, String sause) {
		this.meat = meat;
		this.sause = sause;
	}
	String getMeat() {
		return meat;
	}
	
	String getSause() {
		return sause;
	}
	
	void setMeat(String meat) {
		this.meat=meat;
	}
	
	void setSause(String sause) {
		this.sause=sause;
	}
	
}
