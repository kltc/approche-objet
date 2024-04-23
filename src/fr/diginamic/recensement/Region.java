package fr.diginamic.recensement;

public class Region {

	private String nom;
	private int population;

	public Region(String nom, int population) {
		super();
		this.nom = nom;
		this.population = population;
	}

	@Override
	public String toString() {
		return nom + ", population=" + population;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

}
