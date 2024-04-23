package fr.diginamic.recensement;

import java.util.Scanner;

public abstract class MenuService {

	Recensement recensement = new Recensement();

	public abstract void traiter(Recensement recensement, Scanner scanner);

	public MenuService() {

	}

}
