package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestVilles {

	public static void main(String[] args) {

		ArrayList<Ville> liste = new ArrayList<Ville>();

		Ville v1 = new Ville("Nice", 343000);
		Ville v2 = new Ville("Carcassonne", 47800);
		Ville v3 = new Ville("Narbonne", 53400);
		Ville v4 = new Ville("Lyon", 484000);
		Ville v5 = new Ville("Foix", 9700);
		Ville v6 = new Ville("Pau", 77200);
		Ville v7 = new Ville("Marseille", 850700);
		Ville v8 = new Ville("Tarbes", 40600);

		liste.add(v1);
		liste.add(v2);
		liste.add(v3);
		liste.add(v4);
		liste.add(v5);
		liste.add(v6);
		liste.add(v7);
		liste.add(v8);

		Iterator<Ville> iter = liste.iterator();

		Ville villeInit = liste.get(0);

		int minHabitants = villeInit.getHabitants();
		int maxHabitants = 0;
		String nomVilleMin = null;
		String nomVilleMax = null;

		while (iter.hasNext())

			for (Ville ville : liste) {
				ville = iter.next();

				if (minHabitants > ville.getHabitants()) {
					minHabitants = ville.getHabitants();
					nomVilleMin = ville.getNom();

				} else if (maxHabitants < ville.getHabitants()) {
					maxHabitants = ville.getHabitants();
					nomVilleMax = ville.getNom();
				}
			}

		// Ville villeMin = new Ville (nomVilleMin, minHabitants);
		// System.out.println(villeMin.getNom() + ", " + villeMin.getHabitants());
		System.out.println("Ville la plus peuplée: " + nomVilleMax + " avec " + maxHabitants + " habitants");

		while (iter.hasNext()) {
			Ville ville = iter.next();
			if (ville.getHabitants() == minHabitants) {
				System.out.println(ville);
				liste.remove(ville);
			}

		}

		for (int i = 0; i < liste.size(); i++) {

			Ville ville = liste.get(i);
			if (ville.getHabitants() > 100000) {
				ville.setNom(ville.getNom().toUpperCase());
				liste.set(i, ville);
			}
		}

		System.out.println(liste);

	}

}
