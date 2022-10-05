import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianExample {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println("Just object: " + gc);
        GregorianCalendar ymd = new GregorianCalendar(2000, 9, 29);
        System.out.println("Year, month, day " + ymd);
        GregorianCalendar yMd = new GregorianCalendar(2000, Calendar.SEPTEMBER, 29);
        System.out.println("Calendar.SEPTEMBER " + yMd);
        GregorianCalendar timeStamp = new GregorianCalendar(2000, 9, 29, 12, 42, 42);
        System.out.println("Time stamp is: " + timeStamp);
        int month = timeStamp.get(Calendar.MONTH);
        int day = timeStamp.get(Calendar.DAY_OF_MONTH);
        int year = timeStamp.get(Calendar.YEAR);
        int hour = timeStamp.get(Calendar.HOUR);
        int minute = timeStamp.get(Calendar.MINUTE);
        int second = timeStamp.get(Calendar.SECOND);
        System.out.println("Exact date is: " + day + "." + month + "." + year + "." + " " + hour +  ":" + minute + ":" + second);
        GregorianCalendar deadline = new GregorianCalendar();
        deadline.set(2022, Calendar.MAY, 5);
        System.out.println("Print deadline: " + deadline);
        System.out.println("Short version of deadline: " + deadline.getTime());
        deadline.add(Calendar.DATE, 5);
        System.out.println("Added 5 days: " + deadline.getTime());
        deadline.add(Calendar.DATE, -10);
        System.out.println("Remove 10 days: " + deadline.getTime());
    }
}