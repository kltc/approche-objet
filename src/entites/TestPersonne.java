package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		AdressePostale adr1 = new AdressePostale (30, "Avenue Jeanne d'Arc", 38000, "Grenoble");
		AdressePostale adr2 = new AdressePostale (17, "Rue Jules Cesar", 84000, "Avignon");
		
		Personne psn1 = new Personne("Le", "Kevin", adr1);	
		Personne psn2 = new Personne("Paul", "Pierre", adr2);
		
		//System.out.println(psn1.nom + " " + psn1.prenom + " " + psn1.adressePostale.ville);

		psn1.affichePersonne();
		psn1.afficheAdresse();
		
		psn1.setNom("Bryan");
		psn1.setAdresse(adr2);
		
		psn1.affichePersonne();
		psn1.afficheAdresse();
		
		//System.out.println(psn1.retourneNom(psn1));
		
		
	}

}
