package listes;

public class TestEquals {

	public static void main(String[] args) {
		
		Ville v1 = new Ville("Avignon", 200000);
		Ville v2 = new Ville ("Grenoble", 400000);
		Ville v3 = v1;
		
		if (v1.equals(v3)) {
			System.out.println("Villes identiques");
		}
		else {
			System.out.println("Villes différentes");
		}

	}

}
