// 11. convert string to date



package javaseleniumnew;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class convertdate {

	public static void main(String[] args) {
		
		String stringdate="20221123";
		DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyyMMdd", Locale.ENGLISH);
		LocalDate date=LocalDate.parse(stringdate, formatter);
		System.out.println(date);
		
		// TODO Auto-generated method stub

	}

}
