package fr.diginamic.formes;

public class Carre extends Rectangle {

	private double longueur;

	public Carre(double longueur) {
		this.longueur = longueur;
	}

	public double calculerSurface() {
		double surface;
		surface = longueur * longueur;
		return surface;
	}

	public double calculerPerimetre() {
		double perimetre;
		perimetre = longueur * 4;
		return perimetre;
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

}
