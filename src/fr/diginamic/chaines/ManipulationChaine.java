package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {

		String chaine = "Durand;Marcel;2 523.5";

		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);
		System.out.println("Longueur chaine: " + chaine.length());
		System.out.println("Index première apparation de ';': " + chaine.indexOf(';'));
		System.out.println(chaine.substring(0, 14));
		System.out.println(chaine.substring(7, 13).toUpperCase());
		System.out.println(chaine.substring(7, 13).toLowerCase());

		String[] tableau = chaine.split(";");

		for (int i = 0; i < tableau.length; i++) {
			System.out.println(tableau[i]);
		}

		Salarie salarie1 = new Salarie();

		double salaire = Double.parseDouble(tableau[2].replace(" ", ""));

		salarie1.setNom(tableau[0].toUpperCase());
		salarie1.setPrenom(tableau[1]);
		salarie1.setSalaire(salaire);

		System.out.println(salarie1.toString());
	}

}
