package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {

	public static void main(String[] args) {

		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");

		List<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");

		List<String> liste3 = new ArrayList<String>();

		for (String liste : liste1) {
			// System.out.println(liste);
			liste3.add(liste);
		}

		for (String liste : liste2) {
			// System.out.println(liste);
			liste3.add(liste);
		}

		for (String liste : liste3) {
			System.out.println(liste);
		}

	}

}
