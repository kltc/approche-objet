package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class RechercheDixRegion {

	ArrayList<Region> regions = new ArrayList<Region>();

	public RechercheDixRegion() {

	}

	public void traiter(Recensement recensement, Scanner scanner) {
		int popRegion = 0;
		String nomRegion = null;
		
		int pop1 = 0;
		int pop2 = 0;
		int pop3 = 0;
		int pop4 = 0;
		int pop5 = 0;
		int pop6 = 0;
		int pop7 = 0;
		int pop8 = 0;
		int pop9 = 0;
		int pop10 = 0;
		int pop11 = 0;
		int pop12 = 0;
		int pop13 = 0;


		for (Ville ville : recensement.getVilles()) {
			if (ville.getNomRegion().equals("Auvergne-Rhône-Alpes")) {
				pop1 += ville.getPopulation();
			}
			if (ville.getNomRegion().equals("Bourgogne-Franche-Comté")) {
				pop2 += ville.getPopulation();
			}
			if (ville.getNomRegion().equals("Bretagne")) {
				pop3 += ville.getPopulation();
			}
			if (ville.getNomRegion().equals("Centre-Val de Loire")) {
				pop4 += ville.getPopulation();
			}
			if (ville.getNomRegion().equals("Corse")) {
				pop5 += ville.getPopulation();
			}
			if (ville.getNomRegion().equals("Grand Est")) {
				pop6 += ville.getPopulation();
			}
			if (ville.getNomRegion().equals("Hauts-de-France")) {
				pop7 += ville.getPopulation();
			}
			if (ville.getNomRegion().equals("Île-de-France")) {
				pop8 += ville.getPopulation();
			}
			if (ville.getNomRegion().equals("Normandie")) {
				pop9 += ville.getPopulation();
			}
			if (ville.getNomRegion().equals("Nouvelle-Aquitaine")) {
				pop10 += ville.getPopulation();
			}
			if (ville.getNomRegion().equals("Occitanie")) {
				pop11 += ville.getPopulation();
			}
			if (ville.getNomRegion().equals("Pays de la Loire")) {
				pop12 += ville.getPopulation();
			}
			if (ville.getNomRegion().equals("Provence-Alpes-Côte d'Azur")) {
				pop13 += ville.getPopulation();
			}
		}
		
		Region region1 = new Region ("Auvergne-Rhône-Alpes", pop1);
		
		regions.add(region1);
	
		Region region2 = new Region ("Bourgogne-Franche-Comté", pop2);
		
		regions.add(region2);
		
		Region region3 = new Region ("Bretagne", pop3);
		
		regions.add(region3);
		
		Region region4 = new Region ("Centre-Val de Loire", pop4);
		
		regions.add(region4);
		
		Region region5 = new Region ("Corse", pop5);
		
		regions.add(region5);
		
		Region region6 = new Region ("Grand Est", pop6);
		
		regions.add(region6);
		
		Region region7 = new Region ("Hauts-de-France", pop7);
		
		regions.add(region7);
		
		Region region8 = new Region ("Île-de-France", pop8);
		
		regions.add(region8);
		
		Region region9 = new Region ("Normandie", pop9);
		
		regions.add(region9);
		
		Region region10 = new Region ("Nouvelle-Aquitaine", pop10);
		
		regions.add(region10);
		
		Region region11 = new Region ("Occitanie", pop11);
		
		regions.add(region11);
		
		Region region12 = new Region ("Pays de la Loire", pop12);
		
		regions.add(region12);
		
		Region region13 = new Region ("Provence Alpes Côte d'Azur", pop13);
		
		regions.add(region13);
		
		/*for (Ville ville: recensement.getVilles()) { // trouver le moyen de faire une boucle évitant la répétition ci dessus
			 nomRegion = ville.getNomRegion();
			 
			 for (Ville villeBis: recensement.getVilles()) {
				 
				 if (villeBis.getNomRegion().equals(nomRegion)) {
					 
						popRegion += ville.getPopulation();
						
					}
			 }
			 
			 Region region = new Region(nomRegion, popRegion);
			 regions.add(region);
			
		}*/
		
		Collections.sort(regions, new Comparator<Region>() { // permet de trier les populations par ordre décroissant
			public int compare (Region o1, Region o2) {
				if (o1.getPopulation() == o2.getPopulation()) {
					return 0;
				}
				return o1.getPopulation() > o2.getPopulation() ? -1 : 1;
			}
		});
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i+1 + ". " + regions.get(i));
		}
		
	}

}
