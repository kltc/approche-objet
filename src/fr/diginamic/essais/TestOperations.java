package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {

		double op1 = Operations.calcul(55, 73, '+');
		double op2 = Operations.calcul(33, 92, '-');
		double op3 = Operations.calcul(6, 14, '*');
		double op4 = Operations.calcul(8, 21, '/');

		System.out.println(op1);
		System.out.println(op2);
		System.out.println(op3);
		System.out.println(op4);
	}

}
