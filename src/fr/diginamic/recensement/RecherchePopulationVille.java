package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationVille extends MenuService {

	public RecherchePopulationVille() {

	}

	public void traiter(Recensement recensement, Scanner scanner) {
		int popVille = 0;
		System.out.println("Saisir la ville");
		String choix = scanner.next();
		for (Ville ville : recensement.getVilles()) {
			if (ville.getNomCommune().equals(choix)) {
				popVille = ville.getPopulation();
			}

		}

		if (popVille == 0) {
			System.out.println("Ville inconnue");
		} else {
			System.out.println(choix + " a " + popVille + " habitants");
		}
	}
}
