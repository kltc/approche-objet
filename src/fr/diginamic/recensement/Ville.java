package fr.diginamic.recensement;

public class Ville {

	private String codeRegion;
	private String nomRegion;
	private String codeDpt;
	private String codeCommune;
	private String nomCommune;
	private int population;

	public Ville(String codeRegion, String nomRegion, String codeDpt, String codeCommune, String nomCommune,
			String population) {
		super();
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDpt = codeDpt;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.population = Integer.parseInt(population.trim().replaceAll(" ", ""));
	}

	@Override
	public String toString() {
		return "Ville [codeRegion=" + codeRegion + ", nomRegion=" + nomRegion + ", codeDpt=" + codeDpt
				+ ", codeCommune=" + codeCommune + ", nomCommune=" + nomCommune + ", population=" + population + "]";
	}

	public String getCodeRegion() {
		return codeRegion;
	}

	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public String getCodeDpt() {
		return codeDpt;
	}

	public void setCodeDpt(String codeDpt) {
		this.codeDpt = codeDpt;
	}

	public String getCodeCommune() {
		return codeCommune;
	}

	public void setCodeCommune(String codeCommune) {
		this.codeCommune = codeCommune;
	}

	public String getNomCommune() {
		return nomCommune;
	}

	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

}
