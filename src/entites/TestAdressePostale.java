package entites;

public class TestAdressePostale {

	public static void main(String[] args) {

		/*AdressePostale adr1 = new AdressePostale();
		adr1.numeroRue = 23;
		adr1.libelleRue = "Rue Victor Hugo";
		adr1.codePostal = 44100;
		adr1.ville = "Nantes";
		
		AdressePostale adr2 = new AdressePostale();
		adr2.numeroRue = 30;
		adr2.libelleRue = "Avenue Jeanne dArc";
		adr2.codePostal = 38000;
		adr2.ville = "Grenoble";*/
		
		AdressePostale adr1 = new AdressePostale(23, "Rue Victor Hugo", 44100, "Nantes");
		AdressePostale adr2 = new AdressePostale(30, "Avenue Jeanne d'Arc", 38000, "Grenoble");
		
		System.out.println(adr1.numeroRue + " " + adr1.libelleRue + " " + adr1.codePostal + " " + adr1.ville); //affiche l'adresse 1
	}

}
