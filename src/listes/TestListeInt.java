package listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestListeInt {

	public static void main(String[] args) {

		ArrayList<Integer> liste = new ArrayList<>();

		liste.add(-1);
		liste.add(5);
		liste.add(7);
		liste.add(3);
		liste.add(-2);
		liste.add(4);
		liste.add(8);
		liste.add(5);

		System.out.println(liste);
		System.out.println("Taille liste: " + liste.size());
		System.out.println("Plus grand élément: " + Collections.max(liste));
		System.out.println("Plus petit élément: " + Collections.min(liste));
		liste.remove(Collections.min(liste));
		System.out.println(liste);

		for (int i = 0; i < liste.size(); i++) {
			if (liste.get(i) < 0) {
				liste.set(i, liste.get(i) * -1);
			}
		}

		System.out.println(liste);
	}

}
