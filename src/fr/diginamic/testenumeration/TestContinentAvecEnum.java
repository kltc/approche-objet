package fr.diginamic.testenumeration;

import java.util.ArrayList;
import java.util.List;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		
		ArrayList<VilleCont> villes = new ArrayList<VilleCont>();
		
		villes.add(new VilleCont("New York", 8804190, Continent.AMERIQUE));
		
		villes.add(new VilleCont("Paris", 2161000, Continent.EUROPE));
		
		villes.add(new VilleCont("Pékin", 21540000, Continent.ASIE));
		
		villes.add(new VilleCont("Moscou", 13100000, Continent.EUROPE));
		
		villes.add(new VilleCont("Berlin", 3645000, Continent.EUROPE));
		
		villes.add(new VilleCont("Sydney", 5312000, Continent.OCEANIE));
		
		villes.add(new VilleCont("Sao Paulo", 12330000, Continent.AMERIQUE));
		
		villes.add(new VilleCont("Dakar", 1056000, Continent.AFRIQUE));
		
		for (VilleCont ville: villes) {
			System.out.println(ville);
		}

	}

}
