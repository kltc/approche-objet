package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestListeString {

	public static void main(String[] args) {

		ArrayList<String> liste = new ArrayList<>();

		liste.add("Nice");
		liste.add("Carcassonne");
		liste.add("Narbonne");
		liste.add("Lyon");
		liste.add("Foix");
		liste.add("Pau");
		liste.add("Marseille");
		liste.add("Tarbes");

		System.out.println(liste);

		String nomLong = Collections.max(liste, Comparator.comparing(String::length));

		System.out.println("Nom de ville le plus long: " + nomLong);

		for (int i = 0; i < liste.size(); i++) {
			liste.set(i, liste.get(i).toUpperCase());
		}

		System.out.println(liste);

		for (int i = 0; i < liste.size(); i++) {
			if (liste.get(i).charAt(0) == 'N') {
				liste.remove(i);
			}
		}


	}

}
