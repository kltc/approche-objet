package maps;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapVilles {

	public static void main(String[] args) {

		HashMap<String, Integer> mapVilles = new HashMap<>();
		mapVilles.put("Marseille", 870321);
		mapVilles.put("Montpellier", 305743);
		mapVilles.put("Nantes", 677879);
		mapVilles.put("Paris", 2145906);
		mapVilles.put("Toulouse", 504078);
		mapVilles.put("Lille", 1174273);
		mapVilles.put("Lyon", 522228);
		mapVilles.put("Bordeaux", 256045);

		int minHab = Integer.MAX_VALUE;
		String villeMin = null;

		System.out.println("Valeur initiale minHab = " + minHab);

		/*
		 * for (Entry<String, Integer> ville : mapVilles.entrySet()) {
		 * 
		 * System.out.println(ville.getKey() + " " + ville.getValue());
		 * 
		 * 
		 * 
		 * 
		 * }
		 */

		for (String ville : mapVilles.keySet()) {
			System.out.println(ville + " " + mapVilles.get(ville));
			if (minHab > mapVilles.get(ville)) {

				minHab = mapVilles.get(ville);
				villeMin = ville;
				//System.out.println(minHab);
			}

		}
		
		mapVilles.remove(villeMin);
		
		System.out.println("J'ai supprimé la ville avec le moins d'habitant");
		
		for (String ville : mapVilles.keySet()) {
			
			System.out.println(ville);
		}

	}

}
