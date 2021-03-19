package day10_date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class date_time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(LocalDate.now());
		System.out.println(LocalDate.of(2019,4,7));
		System.out.println(LocalDateTime.now());
		System.out.println(LocalDateTime.of(2019,4,7,6,40));
		LocalDate today=LocalDate.now();
		System.out.println(LocalDate.now());
		System.out.println();
		DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("YYYY MMM dd");
		String date1=today.format(dtf1);
		System.out.println(date1);
		DateTimeFormatter dtf2=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
	}

}
