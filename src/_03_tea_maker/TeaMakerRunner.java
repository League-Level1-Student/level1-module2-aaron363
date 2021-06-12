package _03_tea_maker;

public class TeaMakerRunner {

	public static void main(String[] args) {
		TeaBag teaBag = new TeaBag(TeaBag.GREEN);
		Kettle kettle = new Kettle();
		kettle.boil();
		Cup cup = new Cup();
		cup.makeTea(teaBag, kettle.getWater());
	}

}
