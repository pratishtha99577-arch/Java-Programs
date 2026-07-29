import java.util.Calendar;

public class CalendarDemo {

    public static void main(String[] args) {

        // Create Calendar object
        Calendar cal = Calendar.getInstance();

        // Display current date
        System.out.println("Current Date:");
        System.out.println(cal.get(Calendar.DATE) + "/"
                + (cal.get(Calendar.MONTH) + 1) + "/"
                + cal.get(Calendar.YEAR));

        // Display current time
        System.out.println("\nCurrent Time:");
        System.out.println(cal.get(Calendar.HOUR_OF_DAY) + ":"
                + cal.get(Calendar.MINUTE) + ":"
                + cal.get(Calendar.SECOND));

        // Display day of week
        System.out.println("\nDay of Week: "
                + cal.getDisplayName(Calendar.DAY_OF_WEEK,
                Calendar.LONG,
                java.util.Locale.ENGLISH));

        // Display month name
        System.out.println("Month: "
                + cal.getDisplayName(Calendar.MONTH,
                Calendar.LONG,
                java.util.Locale.ENGLISH));
    }
}