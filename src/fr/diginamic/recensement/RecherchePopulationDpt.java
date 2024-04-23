package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationDpt extends MenuService {

	public RecherchePopulationDpt() {

	}

	public void traiter(Recensement recensement, Scanner scanner) {
		int popDpt = 0;
		System.out.println("Saisir le code du département");
		String choix = scanner.next();
		for (Ville ville : recensement.getVilles()) {
			if (ville.getCodeDpt().equals(choix)) {
				popDpt += ville.getPopulation();
			}

		}

		if (popDpt == 0) {
			System.out.println("Département inconnu");
		} else {
			System.out.println("Le département avec le code " + choix + " a " + popDpt + " habitants");
		}

	}

}
