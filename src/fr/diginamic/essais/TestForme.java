package fr.diginamic.essais;

import fr.diginamic.formes.Rectangle;
import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;

public class TestForme {

	public static void main(String[] args) {

		Cercle cercle = new Cercle(2);
		AffichageForme.afficher(cercle);

		Rectangle rectangle = new Rectangle(4, 2);
		AffichageForme.afficher(rectangle);

		Carre carre = new Carre(5);
		AffichageForme.afficher(carre);

	}

}
