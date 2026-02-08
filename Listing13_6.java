
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

//displays the date and time information for the current time

public static void main(String[] args) {
//construct calendar for current date and time

Calendar calendar = new GregorianCalendar();

System.out.println("Current time is "+new Date());
System.out.println("YEAR: "+calendar.get(Calendar.YEAR));
System.out.println("MONTH: "+calendar.get(Calendar.MONTH));
System.out.println("DATE: "+calendar.get(Calendar.DATE));
System.out.println("HOUR: "+calendar.get(Calendar.HOUR));
System.out.println("HOUR OF DAY: "+calendar.get(Calendar.HOUR_OF_DAY));
System.out.println("MINUTE: "+calendar.get(Calendar.MINUTE));
System.out.println("SECOND: "+calendar.get(Calendar.SECOND));
System.out.println("DAY OF WEEK: "+calendar.get(Calendar.DAY_OF_WEEK));
System.out.println("DAY OF MONTH: "+calendar.get(Calendar.DAY_OF_MONTH));
System.out.println("DAY OF YEAR: "+calendar.get(Calendar.DAY_OF_YEAR));
System.out.println("WEEK OF MONTH: "+calendar.get(Calendar.WEEK_OF_MONTH));
System.out.println("WEEK OF YEAR: "+calendar.get(Calendar.WEEK_OF_YEAR));
System.out.println("AM_PM: "+calendar.get(Calendar.AM_PM));

//calendar for Dec 25, 1997
Calendar calendar1 = new GregorianCalendar(1997,11,25);

String[] dayNameofWeek = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
System.out.println("December 25, 1997 is a "+ dayNameofWeek[calendar1.get(Calendar.DAY_OF_WEEK)-1]);
    

}
