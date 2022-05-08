package dpPracticals;

public class MainMobile {

	public static void main(String[] args) {
		Mobile mob = new Mobile.Builder()
				.setName("Realme")
				.setColor("Green")
				.setRam("8 GB")
				.setProcessor("Helios 920")
				.build();
		System.out.println(mob);
		Mobile mob1 = new Mobile.Builder()
				.setName("Vivo")
				.setColor("Blue")
				.setRam("4 GB")
				.setProcessor("SnapDragon 712")
				.build();
		System.out.println(mob1);
	}

}
