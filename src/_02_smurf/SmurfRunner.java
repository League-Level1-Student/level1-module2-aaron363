package _02_smurf;

public class SmurfRunner {

	public static void main(String[] args) {
		Smurf Handy = new Smurf("Handy");
		Handy.eat();
		System.out.println(Handy.getName());
		
		Smurf Papa = new Smurf("Papa");
		System.out.println(Papa.getName());
		System.out.println(Papa.getHatColor("Red"));
		System.out.println(Papa.isGirlOrBoy("Boy"));
		
		Smurf Smurfette = new Smurf("Smurfette");
		System.out.println(Smurfette.getName());
		System.out.println(Smurfette.getHatColor("White"));
		System.out.println(Smurfette.isGirlOrBoy("Girl"));
		
		

	}

}
