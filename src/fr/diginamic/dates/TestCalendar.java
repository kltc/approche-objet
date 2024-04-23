package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();

		cal.set(2016, 4, 19, 23, 59, 30);

		Date d1 = cal.getTime();

		SimpleDateFormat formateur = new SimpleDateFormat("yyyy/MM/dd");

		String dateFormatee1 = formateur.format(d1);

		System.out.println(dateFormatee1);

		cal = Calendar.getInstance();

		Date d2 = cal.getTime();

		formateur = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		String dateFormatee2 = formateur.format(d2);

		System.out.println(dateFormatee2);

		formateur = new SimpleDateFormat("EEEEE dd MMMM yyyy", Locale.FRANCE);

		String dateFrance = formateur.format(d2);

		System.out.println(dateFrance);

		formateur = new SimpleDateFormat("EEEEE dd MMMM yyyy", Locale.CHINA);

		String dateChine = formateur.format(d2);

		System.out.println(dateChine);

		formateur = new SimpleDateFormat("EEEEE dd MMMM yyyy", Locale.GERMANY);

		String dateAllemagne = formateur.format(d2);

		System.out.println(dateAllemagne);

		Locale localeRu = new Locale("ru", "RU");

		formateur = new SimpleDateFormat("EEEEE dd MMMM yyyy", localeRu);

		String dateRusse = formateur.format(d2);

		System.out.println(dateRusse);

	}

}
