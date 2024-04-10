package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {

		CalculMoyenne.ajout(0, 5.0);
		CalculMoyenne.ajout(1, 2.1);
		CalculMoyenne.ajout(2, 43.9);
		CalculMoyenne.ajout(3, 18.2);
		CalculMoyenne.ajout(4, 923.6);
		CalculMoyenne.ajout(5, 34.4);
		CalculMoyenne.ajout(9, 6.8);

		System.out.println("La moyenne des éléments du tableau est : " + CalculMoyenne.calcul());

		CalculMoyenne.ajout(0, -37.3);
		CalculMoyenne.ajout(1, 49.9);
		CalculMoyenne.ajout(2, 31.0);
		CalculMoyenne.ajout(3, -83.8);
		CalculMoyenne.ajout(4, 120.0);
		CalculMoyenne.ajout(5, -51.7);
		CalculMoyenne.ajout(6, -29.0);
		CalculMoyenne.ajout(7, 203.5);
		CalculMoyenne.ajout(8, -99.7);
		CalculMoyenne.ajout(9, -1.6);

		System.out.println("La moyenne des éléments du tableau est : " + CalculMoyenne.calcul());

	}

}
