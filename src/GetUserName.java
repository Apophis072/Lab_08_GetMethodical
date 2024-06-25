
import java.util.Scanner;

public class GetUserName
{
    public static void main (String[]args)
    {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        int favInt;
        double favDouble;

        //First and last name
        firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
        SafeInput.getNonZeroLenString(in, "Enter your last name");
        System.out.println("\nYour full name is: " + firstName + " " + lastName);
    }
}
