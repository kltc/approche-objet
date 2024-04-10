package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {

	public static void main(String[] args) {

		double somme = 0.0;

		Operation[] operations = new Operation[4];
		operations[0] = new Debit("01/01/2024", 125.5);
		operations[1] = new Credit("03/01/2024", 50);
		operations[2] = new Debit("07/01/2024", 500);
		operations[3] = new Credit("14/01/2024", 2000);

		for (int i = 0; i < operations.length; i++) {
			System.out.println(operations[i]);

			if (operations[i].getType() == "Credit") {
				somme += operations[i].getMontant();
			} else {
				somme -= operations[i].getMontant();
			}

			// == que pour comparer type primitifs : byte, short, int, long, double, float,
			// char, boolean
		}

		System.out.println("Le montant global est : " + somme);
	}

}
