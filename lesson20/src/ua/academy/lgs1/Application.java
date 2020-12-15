package ua.academy.lgs1;


import java.util.Date;

public class Application {public static void main(String[] args) {
	Date date =  new Date();
	System.out.println(date);
	System.out.println(Methods.fromDateToLocalDate(date));
	System.out.println(Methods.fromDateToLocalTime(date));
	System.out.println(Methods.fromDateToLocalDateTime(date));
}

}
