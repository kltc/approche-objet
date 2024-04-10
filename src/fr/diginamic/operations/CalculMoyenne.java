package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {

	static double[] tableau = new double[0];

	public static void ajout(int i, double valeur) {

		if (i < tableau.length) {
			tableau[i] = valeur;
		} else if (i >= tableau.length) {
			tableau = Arrays.copyOf(tableau, i + 1); // agrandissement du tableau si l'index n'existe pas
			tableau[i] = valeur;
		}
	}

	public static double calcul() {

		double somme = 0.0;

		for (int i = 0; i < tableau.length; i++) {
			somme += tableau[i];
		}

		double moy = somme / tableau.length;
		return moy;
	}

}
