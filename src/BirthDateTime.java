import java.util.Scanner;

public class BirthDateTime
{
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        int year = (SafeInput.getRangedInt(in, "Enter the year you were born ", 1950, 2015));
        int month = (SafeInput.getRangedInt(in, "Enter the month you were born ", 1, 12));
        int numDays = 0;
        switch (month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) && (!(year % 100 == 0)) || (year % 400 == 0))) {
                    numDays = 29;
                }
                else
                {
                    numDays = 28;
                }
                break;
        }
        int day = (SafeInput.getRangedInt(in, "Enter the day you were born ", 1, numDays));
        int hour = (SafeInput.getRangedInt(in, "Enter the hour you were born in 24 hour format ", 1, 24));
        int minute = (SafeInput.getRangedInt(in, "Enter your minute of birth in hour format ", 0, 59));
        String morningOrEvening = " A.M.";
        if (hour > 12)
        {
            hour -= 12;
            morningOrEvening = " P.M.";
        }
        if(minute < 10)
        {
            System.out.println("You were born at " + hour + ":" + "0" + minute + morningOrEvening + " on " + month + "/" + day + "/" + year + ".");
        }
        else
            System.out.println("You were born at " + hour + ":" + minute + morningOrEvening + " on " + month + "/" + day + "/" + year + ".");
    }
}
