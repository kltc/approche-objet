package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.List;

public class Recensement {

	private ArrayList<Ville> villes = new ArrayList<>();

	public Recensement() {

	}

	public void addVille(Ville ville) {
		villes.add(ville);
	}

	@Override
	public String toString() {
		return "Recensement [villes=" + villes + "]";
	}

	public List<Ville> getVilles() {
		return villes;
	}

	public void setVilles(ArrayList<Ville> villes) {
		this.villes = villes;
	}

}
