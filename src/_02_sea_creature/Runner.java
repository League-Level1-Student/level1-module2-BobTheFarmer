package _02_sea_creature;

public class Runner {
	public static void main(String[] args) {
	SeaCreature bob = new SeaCreature("Spongebob");
		bob.eat();
		bob.laugh();
		
		
	SeaCreature squid = new SeaCreature("Squidward");
		System.out.println(squid.getName());
		squid.eat();
		squid.laugh();
		
	SeaCreature patrick = new SeaCreature("Patrick");
		System.out.println(patrick.getName());
		patrick.eat();
		patrick.laugh();
	}
}