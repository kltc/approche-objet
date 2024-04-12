package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {

		Path pathCible = Paths.get(
				"C:\\Users\\Keo\\Documents\\workspace-spring-tool-suite-4-4.22.0.RELEASE\\approche-objet\\src\\fichier\\GenererFichier.csv");

		List<String> fichierCible = new ArrayList<>();

		fichierCible.add("Nom;Code département;Nom de la région;Population totale");

		ArrayList<Ville> villes = new ArrayList<Ville>();

		Path path = Paths.get(
				"C:\\Users\\Keo\\Documents\\workspace-spring-tool-suite-4-4.22.0.RELEASE\\approche-objet\\src\\fichier\\recensement.csv");

		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

		// System.out.println(lines);

		for (int i = 1; i < lines.size(); i++) {

			String[] token = lines.get(i).split(";");
			Ville ville = new Ville(token[6], token[2], token[1], token[9]);
			villes.add(ville);
			// System.out.println(villes.get(i-1).getNom());

		}

		for (int j = 0; j < villes.size(); j++) {
			String pop = villes.get(j).getPopulation().trim().replaceAll(" ", "");
			int popInt = Integer.parseInt(pop);
			if (popInt > 25000) {
				fichierCible.add(villes.get(j).toString());
			}

		}

		for (int k = 0; k < fichierCible.size(); k++) {
			System.out.println(fichierCible.get(k));
		}
		
		Files.createFile(pathCible);
		Files.write(pathCible, fichierCible, StandardOpenOption.APPEND);

	}

}
