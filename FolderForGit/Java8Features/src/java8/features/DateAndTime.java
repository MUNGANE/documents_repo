package java8.features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class DateAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		int dd= date.getDayOfMonth();
		int mm= date.getMonthValue();
		int yy= date.getYear();
		System.out.println(dd+"-"+mm+"-"+yy);
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		int h=time.getHour();
		int m= time.getMinute();
		int s=time.getSecond();
		int n=time.getNano();
		System.out.printf("%d:%d:%d:%d\n",h,m,s,n);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		
		int dd1= date.getDayOfMonth();
		int mm1= date.getMonthValue();
		int yy1= date.getYear();
		System.out.println("\n"+dd1+"-"+mm1+"-"+yy1);
		
		int h1=time.getHour();
		int m1= time.getMinute();
		int s1=time.getSecond();
		int n1=time.getNano();
		System.out.printf("%d:%d:%d:%d\n",h1,m1,s1,n1);
		
		LocalDateTime dt1 = LocalDateTime.of(1999,Month.DECEMBER ,1, 12, 45);
		System.out.println(dt1);
		System.out.println("After six months"+dt1.plusMonths(6));
		System.out.println("before six months"+dt1.minusMonths(6));
		
		LocalDate birthday=LocalDate.of(1999, 12, 1);
		LocalDate today=LocalDate.now();
		Period p=Period.between(birthday, today);
		System.out.printf("Age is %d years %d mpnths %d day",p.getYears(),p.getMonths(),p.getDays());
		
		Scanner ss=new Scanner(System.in);
		System.out.println("\nenter your year");
		int year=ss.nextInt();
		Year Y=Year.of(year);
		if(Y.isLeap()) {
			System.out.println("leap year");
			
		}
		else {
			System.out.println("not leap ");
		}
		
		ZoneId zone=ZoneId.systemDefault();
		System.out.println("\n"+zone);
		
		ZoneId zone1=ZoneId.of("America/Los_Angeles");
		ZonedDateTime zd=ZonedDateTime.now(zone1);
		System.out.println("\n"+zd);
		
		
		

	}

}
