import java.util.Calendar;
import java.util.GregorianCalendar;

public class APCalendar
{

 /** Returns the number of leap years between year1 and year2, inclusive.
  * Preconditions: 0 <= year1 <= year2
  * @param year1
           The year to begin with, inclusive
    @param year2
           The year to end with, inclusive.
 */
 public static int numberOfLeapYears(int year1, int year2)
 {
    int leapYears = 0;

    for (int x=year1; x <= year2; x++) {
        if (isLeapYear(x)) {
            leapYears++;
        }
    }

    return leapYears;
 }

 /** Returns true if year is a leap year and false otherwise. */
 private static boolean isLeapYear(int year)
 {
     return new GregorianCalendar().isLeapYear(year);
 }

 public static void main(String[] args)
 {
     int answer = APCalendar.numberOfLeapYears(2000, 2050);
     System.out.println("Your answer should be 13: " + answer);
 }
}
