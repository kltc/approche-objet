package fr.diginamic.testenumeration;

public enum Continent {

	EUROPE("Europe"), AMERIQUE("Amérique"), ASIE("Asie"), AFRIQUE("Afrique"), OCEANIE("Océanie");

	private String nom;

	private Continent(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return nom;
	}

}
