package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {

	public static void afficher(Forme forme) {
		double perimetre = forme.calculerPerimetre();
		double surface = forme.calculerSurface();

		System.out.println(forme.getClass().getSimpleName() + ", surface= " + surface + " m2" + ", périmètre= " + perimetre + " m");
	}

}
