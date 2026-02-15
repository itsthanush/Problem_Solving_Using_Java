import java.util.Calendar;

public class Task8_date_time {
    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();
        cal.set(2024, Calendar.JUNE, 15); // Set the date to June 15, 2024
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        String[] dayNames = {
            "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
        };
        String dayName = dayNames[dayOfWeek - 1]; // Adjust for 0-based array index
        System.out.println("The day of the week is: " + dayName);
}
}