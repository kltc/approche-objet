package fr.diginamic.testenumeration;

public class VilleCont {
	private String nom;
	private int habitants;
	private Continent continent;

	public VilleCont(String nom, int habitants, Continent continent) {
		super();
		this.nom = nom;
		this.habitants = habitants;
		this.continent = continent;
	}

	@Override
	public String toString() {
		return nom + " " + habitants + " habitants" + " " + continent;
	}

	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof VilleCont)) {
			return false;
		}

		VilleCont autre = (VilleCont) obj;

		int population = autre.getHabitants();
		String nom = autre.getNom();

		if (this.nom == nom && this.habitants == population) {
			return true;
		}

		else {
			return false;
		}

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getHabitants() {
		return habitants;
	}

	public void setHabitants(int habitants) {
		this.habitants = habitants;
	}

	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

}
