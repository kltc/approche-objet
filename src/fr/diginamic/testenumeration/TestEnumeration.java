package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {

		Saison[] saisons = Saison.values();

		for (Saison saison : saisons) {
			System.out.println(saison);
		}

		System.out.println("--------------");

		String nom = "ETE";

		System.out.println(Saison.valueOf(nom));

		System.out.println("--------------");

		String libelle = "Hiver";

		System.out.println(Saison.obtenirSaison(libelle));

		System.out.println("--------------");

		String test = "test";

		System.out.println(Saison.obtenirSaison(test));
	}

}
