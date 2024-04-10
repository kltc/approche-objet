package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {

		// Cercle cercle1 = new Cercle(4);
		// Cercle cercle2 = new Cercle(10);

		Cercle cercle1 = CercleFactory.getCercle(4);
		Cercle cercle2 = CercleFactory.getCercle(10);

		System.out.println("Le cercle 1 a un rayon de " + cercle1.getRayon() + " m, un périmètre de "
				+ cercle1.getPerimetre() + " m et une surface de " + cercle1.getSurface() + " m2");
		System.out.println("Le cercle 2 a un rayon de " + cercle2.getRayon() + " m, un périmètre de "
				+ cercle2.getPerimetre() + " m et une surface de " + cercle2.getSurface() + " m2");

	}

}
