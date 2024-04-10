package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

	private double taux;

	public CompteTaux(String numero, double solde, double taux) {
		super(numero, solde);
		this.taux = taux;
	}

	@Override
	public String toString() {
		return "CompteTaux [taux=" + taux + ", toString()=" + super.toString() + ", getNumero()=" + getNumero()
				+ ", getSolde()=" + getSolde() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
