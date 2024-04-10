package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {

		Theatre theatre1 = new Theatre("Grand Theatre", 500, 0, 0.0);
		
		System.out.println("Nom = " + theatre1.getNom());

		System.out.println(theatre1.toString());

		theatre1.inscrire(120, 5.9);

		System.out.println(theatre1.toString());
		
		theatre1.inscrire(190, 7);

		System.out.println(theatre1.toString());

		theatre1.inscrire(250, 8);

		System.out.println(theatre1.toString());

		theatre1.inscrire(1, 10);

		System.out.println(theatre1.toString());

	}

}
