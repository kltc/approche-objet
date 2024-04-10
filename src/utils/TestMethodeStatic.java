package utils;

public class TestMethodeStatic {

	public static void main(String[] args) {
		String chaine = "12";

		int entier = Integer.valueOf(chaine);

		System.out.println(chaine);
		System.out.println(entier);
		
		int a = entier;
		int b = 15;
		
		System.out.println(Integer.max(a, b));

	}

}
