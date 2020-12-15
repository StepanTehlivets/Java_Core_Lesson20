package ua.academy.lgs1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;


public class Methods {
	public static LocalDate fromDateToLocalDate(Date inputDate) {
		LocalDate ld = inputDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return ld;
	}

	public static LocalTime fromDateToLocalTime(Date inputDate) {
		LocalTime lt = inputDate.toInstant().atZone(ZoneId.systemDefault()).toLocalTime().truncatedTo(ChronoUnit.SECONDS);
		return lt;
	}

	public static LocalDateTime fromDateToLocalDateTime(Date inputDate) {
		LocalDateTime ldt = inputDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime().truncatedTo(ChronoUnit.SECONDS);
		return ldt;
	}

}