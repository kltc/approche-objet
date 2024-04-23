package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApplicationRecensement {

	public static void main(String[] args) throws IOException {

		ArrayList<Region> regions = new ArrayList<Region>();

		Path path = Paths.get(
				"C:\\Users\\Keo\\Documents\\workspace-spring-tool-suite-4-4.22.0.RELEASE\\approche-objet\\src\\fichier\\recensement.csv");

		List<String> liste = Files.readAllLines(path, StandardCharsets.UTF_8);

		liste.remove(0);

		Recensement recensement = new Recensement();

		for (String ligne : liste) {
			String[] elements = ligne.split(";");
			Ville ville = new Ville(elements[0], elements[1], elements[2], elements[5], elements[6], elements[9]);
			recensement.addVille(ville);
			//System.out.println(ville);
		}

		int choix = 0;

		System.out.println("Saisir le traitement souhaité");
		System.out.println("1. Population d'une ville");
		System.out.println("2. Population d'un département");
		System.out.println("3. Population d'une région");
		System.out.println("4. 10 régions les plus peuplées");

		Scanner scanner = new Scanner(System.in);
		choix = scanner.nextInt();

		switch (choix) {
		case 1:
			RecherchePopulationVille recherchePopulationVille = new RecherchePopulationVille();
			recherchePopulationVille.traiter(recensement, scanner);
			break;
			
		case 2 :
			RecherchePopulationDpt recherchePopulationDpt = new RecherchePopulationDpt();
			recherchePopulationDpt.traiter(recensement, scanner);
			break;
			
		case 3 :
			RecherchePopulationRegion recherchePopulationRegion = new RecherchePopulationRegion();
			recherchePopulationRegion.traiter(recensement, scanner);
			break;
			
		case 4 :
			RechercheDixRegion rechercheDixRegion = new RechercheDixRegion();
			rechercheDixRegion.traiter(recensement, scanner);
			break;
		}
	}

}
