package maps;

import java.util.HashMap;

public class CreationEtManipulationMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");

		for (int departement : mapVilles.keySet()) {
			System.out.print(departement + " ");
		}

		System.out.println();

		for (String ville : mapVilles.values()) {
			System.out.print(ville + " ");
		}

		System.out.println();

		System.out.println("Taille map: " + mapVilles.size());
	}

}
