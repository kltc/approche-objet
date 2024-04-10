package fr.diginamic.entites;

public class Theatre {

	private String nom;
	private int capacite;
	private int inscrits;
	private double recette;

	public Theatre(String nom, int capacite, int inscrits, double recette) {
		super();
		this.nom = nom;
		this.capacite = capacite;
		this.inscrits = inscrits;
		this.recette = recette;
	}

	public void inscrire(int inscrits, double prixPlace) {

		if (inscrits <= capacite) {
			this.inscrits += inscrits;
			this.recette += prixPlace * inscrits;
			this.capacite -= inscrits;
		} else {
			System.out.println("Capacité max du théâtre atteinte");
			this.inscrits += capacite;
			this.recette += prixPlace * capacite;
			this.capacite = 0;			
		}

	}

	@Override
	public String toString() {
		return "Places restantes = " + capacite + ", inscrits = " + inscrits + ", recette = " + recette
				+ " €";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	public int getInscrits() {
		return inscrits;
	}

	public void setInscrits(int inscrits) {
		this.inscrits = inscrits;
	}

	public double getRecette() {
		return recette;
	}

	public void setRecette(double recette) {
		this.recette = recette;
	}

}
