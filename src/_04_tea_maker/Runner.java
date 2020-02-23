package _04_tea_maker;

public class Runner {
	public static void main(String[] args) {
		TeaBag teaBag = new TeaBag("flavor");
		Kettle kettle = new Kettle();
			kettle.boil();
		Cup cup = new Cup();
			cup.makeTea(teaBag, kettle.getWater());
	}
}
