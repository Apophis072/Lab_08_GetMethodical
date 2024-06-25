import java.util.Scanner;


public class DevTest
{
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    String SSN = "";
    String prettyHeader = "";

    SSN = SafeInput.getRegExString(in, "Enter your SSN: ", "^\\d{3}-\\d{2}-\\d{4}$");
    System.out.println("Your social security number is: " + SSN);

    prettyHeader = SafeInput.prettyHeader(in, "Enter your message here: ");
        System.out.println(prettyHeader);



    }
}