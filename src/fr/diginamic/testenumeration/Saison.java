package fr.diginamic.testenumeration;

public enum Saison {

	PRINTEMPS(1, "Printemps"), ETE(2, "Eté"), AUTOMNE(3, "Automne"), HIVER(4, "Hiver");

	private int numero;
	private String nom;

	private Saison(int numero, String nom) {
		this.numero = numero;
		this.nom = nom;
	}

	public int getNumero() {
		return numero;
	}

	public String getNom() {
		return nom;
	}

	public static Saison obtenirSaison(String libelle) {

		for (Saison saison : values()) {
			if (saison.getNom().equals(libelle)) {
				return saison;
			}
		}
		throw new IllegalArgumentException("Erreur");

	}

	public String toString() {
		return nom + " " + numero;
	}

}
