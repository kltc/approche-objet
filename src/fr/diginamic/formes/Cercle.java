package fr.diginamic.formes;

public class Cercle extends Forme {

	private double rayon;

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	public double calculerSurface() {
		double surface;
		surface = Math.PI * rayon * rayon;
		return surface;
	}

	public double calculerPerimetre() {
		double perimetre;
		perimetre = 2 * Math.PI * rayon;
		return perimetre;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

}
