package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {

	public static void main(String[] args) throws IOException {

		Path pathCible = Paths.get(
				"C:\\Users\\Keo\\Documents\\workspace-spring-tool-suite-4-4.22.0.RELEASE\\approche-objet\\src\\fichier\\recensement2.csv");
		List<String> fichierCible = new ArrayList<>();

		Path pathSource = Paths.get(
				"C:\\Users\\Keo\\Documents\\workspace-spring-tool-suite-4-4.22.0.RELEASE\\approche-objet\\src\\fichier\\recensement.csv");

		List<String> fichierSource = Files.readAllLines(pathSource, StandardCharsets.UTF_8);

		for (int i = 0; i < 100; i++) {
			fichierCible.add(fichierSource.get(i));
		}

		for (int i = 0; i < fichierCible.size(); i++) {
			System.out.println(fichierSource.get(i));
		}
		
		Files.createFile(pathCible);
		Files.write(pathCible, fichierCible, StandardOpenOption.APPEND);

	}

}
