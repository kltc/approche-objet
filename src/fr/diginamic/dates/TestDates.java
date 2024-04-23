package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {

		Date d1 = new Date();

		SimpleDateFormat formateur = new SimpleDateFormat("yyyy/MM/dd");

		String dateFormatee1 = formateur.format(d1);

		System.out.println(dateFormatee1);

		Date d2 = new Date(116, 4, 19, 23, 59, 30);

		formateur = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		String dateFormatee2 = formateur.format(d2);

		System.out.println(dateFormatee2);

		String dateFormatee3 = formateur.format(d1);

		System.out.println(dateFormatee3);

	}

}
