import java.sql.SQLOutput;
import java.util.Scanner;

public class BirthDateTime
{
    public static void main (String[]args)
    {
        Scanner in = new Scanner(System.in);
        int birthYear;
        int birthMonth;
        int birthDay;
        int birthHour;
        int birthMinute;

        birthYear = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015);
        birthMonth = SafeInput.getRangedInt(in, "Enter your birth month", 1,12);

        switch (birthMonth)
        {
            case 2:
            {
                birthDay = SafeInput.getRangedInt(in, "Enter your day of birth", 1 , 28);
                break;
            }
            case 4,6,9,11:
            {
                birthDay = SafeInput.getRangedInt(in, "Enter your day of birth",1,30);
                break;
            }
            default:
            {
                birthDay = SafeInput.getRangedInt(in,"Enter your day of birth", 1, 31);
            }
        }
        birthHour = SafeInput.getRangedInt(in, "Enter your hour of birth", 1,24);
        birthMinute = SafeInput.getRangedInt(in, "Enter your minute of birth", 1,59);

        System.out.println("Here is your birth information:\nYear: " + birthYear + "\tMonth: " + birthMonth + "\tDay: " + birthDay + "\tHour: " + birthHour +"\tMinute: " + birthMinute);

    }
}
