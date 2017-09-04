package org.cusey.JodaTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class MainJodaTime {

    public static void main(String[] args) {

        DateTimeFormatter stf_date = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter stf_date_time = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        LocalDate wedding_date = LocalDate.of(2017, Month.FEBRUARY, 22);
        System.out.println("Date of the wedding: " + wedding_date .format(stf_date)) ;

        LocalTime wedding_time = LocalTime.of(13, 15);
        System.out.println("Time of the wedding: " + wedding_time);

        LocalDate anniversary = wedding_date.plusMonths(6);

        System.out.println("Six month anniversary date: " + anniversary.format(stf_date)) ;

        LocalDateTime celebrate = LocalDateTime.of(anniversary,wedding_time);

        System.out.println("Six month anniversary date and time:  " + celebrate.format(stf_date_time)) ;

        LocalDateTime reschedule = celebrate.withDayOfMonth(25);

        System.out.println("Reschedule date to the twenty fifty: " + reschedule.format(stf_date_time)) ;

        LocalDateTime future_celebrate = celebrate.plusYears(5);

        //Get the value of the particular temporal field
        int future_celebrate_year = future_celebrate.get(ChronoField.YEAR);

        System.out.println("Five year celebration : " + future_celebrate_year) ;
        System.out.println("Five year celebration date: " + future_celebrate.format(stf_date_time)) ;


        // Get the current date and time
        ZonedDateTime webbing_in_asia = ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Karachi]");
        System.out.println("Location and time of the wedding in Japan is " + webbing_in_asia);

        ZoneId id = ZoneId.of("Europe/Paris");
        System.out.println("ZoneId: " + id);

        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("CurrentZone: " + currentZone);

	      /*
			Date of the wedding: 02/22/2017
			Time of the wedding: 13:15
			Six month anniversary date: 08/22/2017
			Six month anniversary date and time:  2017-08-22 13:15:00
			Reschedule date to the twenty fifty: 2017-08-25 13:15:00
			Five year celebration : 2022
			Five year celebration date: 2022-08-22 13:15:00
			Location and time of the wedding in Japan is 2007-12-03T10:15:30+05:00[Asia/Karachi]
			ZoneId: Europe/Paris
			CurrentZone: America/New_York
	       */


    }
}
