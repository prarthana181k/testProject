package day10_date;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class date_formatter {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter joining date");
		String birth_date=scanner.nextLine();
		LocalDate today= LocalDate.now();
		DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate birthdate=LocalDate.parse(birth_date,dtf1);
		System.out.println(birthdate);
		Period age=Period.between(birthdate, today);
		System.out.println("age year= "+age.getYears()+"age in months "+age.getMonths()+"age in days "+age.getDays());

	}

}
