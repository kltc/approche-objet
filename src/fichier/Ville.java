package fichier;

public class Ville implements Comparable<Ville>{

	private String nom;
	private String dpt;
	private String region;
	private String population;

	public Ville(String nom, String dpt, String region, String population) {
		super();
		this.nom = nom;
		this.dpt = dpt;
		this.region = region;
		this.population = population;
	}

	@Override
	public String toString() {
		return nom + ";" + dpt + ";" + region + ";" + population;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDpt() {
		return dpt;
	}

	public void setDpt(String dpt) {
		this.dpt = dpt;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}
	
	public int compareTo (Ville autre) {
		int result = this.nom.compareTo(autre.getNom()); // c'est le compareTo String
		return result;
	}


}
