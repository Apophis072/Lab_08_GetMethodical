import javax.xml.transform.Source;
import java.util.Scanner;

public class Reggie
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        String SSN = "";
        String UCMNum = "";
        String menuChoice = "";

        SSN = SafeInput.getRegExString(in, "Enter your social security number: ", "\\d{3}-\\d{2}-\\d{4}$");
        UCMNum = SafeInput.getRegExString(in, "Enter your UC Student M number: ", "^(M|m)\\d{5}$");
        menuChoice = SafeInput.getRegExString(in, "Enter your menu choice[open, save, view, quit]: ", "^[OoSsVvQq]$");

        System.out.println("Your social security number is: " + SSN);
        System.out.println("Your UC student M number is: " + UCMNum);
        if (menuChoice.equalsIgnoreCase("O"))
        {
            System.out.println("You choose to open menu choice.");
        }
        else if (menuChoice.equalsIgnoreCase("S"))
        {
            System.out.println("You choose to save menu choice.");
        }
        else if (menuChoice.equalsIgnoreCase("V"))
        {
            System.out.println("You choose to view menu choice.");
        }
        else
        {
            System.out.println("You choose to quit menu choice.");
        }

    }
}
