import java.util.Scanner;

public class PrettyHeader
{
    public static void main (String[]args)
    {
        Scanner in = new Scanner(System.in);
        String prettyHeader = "";


        prettyHeader = SafeInput.prettyHeader(in, "Enter your message here: ");
        System.out.println(prettyHeader);
    }
}
