package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {

		Compte compte = new Compte("AC3439847N", 1500.0);
		CompteTaux compteTaux = new CompteTaux("ZE9347386", 3400.0, 5);

		// System.out.println(compte);

		Compte[] tableau = { compte, compteTaux };

		for (int i = 0; i < tableau.length; i++) {
			System.out.println(tableau[i]);
		}
	}

}
