package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationRegion extends MenuService {

	public RecherchePopulationRegion() {

	}

	public void traiter(Recensement recensement, Scanner scanner) {
		int popRegion = 0;
		System.out.println("Saisir le nom de la région");
		String choix = scanner.next();
		for (Ville ville : recensement.getVilles()) {
			if (ville.getNomRegion().equals(choix)) {
				popRegion += ville.getPopulation();
			}
		}

		if (popRegion == 0) {
			System.out.println("Région inconnue");
		} else {
			System.out.println(choix + " a " + popRegion + " habitants");
		}

	}

}
