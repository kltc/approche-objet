package listes;

public class Ville {

	private String nom;
	private int habitants;

	public Ville(String nom, int habitants) {
		super();
		this.nom = nom;
		this.habitants = habitants;
	}

	@Override
	public String toString() {
		return "[nom=" + nom + ", habitants=" + habitants + "]";
	}

	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof Ville)) {
			return false;
		}

		Ville autre = (Ville) obj;

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

}
