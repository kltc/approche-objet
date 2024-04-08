package entites2;

import entites.AdressePostale;

public class Personne {

	public String nom;
	public String prenom;
	public AdressePostale adressePostale;
	
	public Personne (String pnom, String pprenom, AdressePostale adr) {
		nom = pnom;
		prenom = pprenom;
		adressePostale = adr;
	}
	
	public void affichePersonne() {
		System.out.println(nom.toUpperCase() + " " + prenom);
	}
	
	public void afficheAdresse () {
		System.out.println(adressePostale.numeroRue + " " + adressePostale.libelleRue + " " + adressePostale.codePostal + " " + adressePostale.ville);
	}
	
	public void setNom (String pnom) {
		nom = pnom; 
	}
	
	public void setPrenom (String pprenom) {
		prenom = pprenom; 
	}
	
	public void setAdresse (AdressePostale adr) {
		adressePostale = adr; 
	}
	
	public String getNom () {
		return nom;
	}
	
	public String getPrenom () {
		return prenom;
	}
	
	public AdressePostale getAdresse () {
		return adressePostale;
	}
	
}