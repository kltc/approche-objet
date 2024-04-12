package tri;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fichier.Ville;

public class TestTri {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get(
				"C:\\Users\\Keo\\Documents\\workspace-spring-tool-suite-4-4.22.0.RELEASE\\approche-objet\\src\\fichier\\recensement.csv");
		
		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		
		ArrayList<Ville> villes = new ArrayList<Ville>();
		
		for (int i = 1; i < lines.size(); i++) {

			String[] token = lines.get(i).split(";");
			Ville ville = new Ville(token[6], token[2], token[1], token[9]);
			villes.add(ville);
			// System.out.println(villes.get(i-1).getNom());

		}
		
		Collections.sort(villes);
		
		for (Ville ville: villes) {
			System.out.println(ville);
		}
		
	}

}
