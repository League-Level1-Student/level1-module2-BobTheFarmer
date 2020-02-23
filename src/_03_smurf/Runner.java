package _03_smurf;

public class Runner {
	/* 
	 * 1. Watch this Smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
	 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
	 * 3&4 see comments in code below
	 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
	 * 6. Make a Smurfette and print her name, hat color and girl or boy. 
	 */
	public static void main(String[] args) {
		Smurf smurf = new Smurf("Handy");
			smurf.eat();
			
		Smurf smurf2 = new Smurf("Papa Smurf");
			System.out.println(smurf2.getHatColor());
			System.out.println(smurf2.isGirlOrBoy());
		
		Smurf smurf3 = new Smurf("Smurfette");
		System.out.println(smurf3.getHatColor());
		System.out.println(smurf3.isGirlOrBoy());
}
}
