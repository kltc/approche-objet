package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		Personne psn1 = new Personne();
		psn1.nom = "LE";
		psn1.prenom = "Kevin";
		psn1.adressePostale = new AdressePostale (30, "Avenue Jeanne d'Arc", 38000, "Grenoble"); 
		
		Personne psn2 = new Personne();
		psn2.nom = "Pierre";
		psn2.prenom = "Paul";
		psn2.adressePostale = new AdressePostale (17, "Rue Jules Cesar", 84000, "Avignon");
		
		System.out.println(psn1.nom + " " + psn1.prenom + " " + psn1.adressePostale.ville);

	}

}
