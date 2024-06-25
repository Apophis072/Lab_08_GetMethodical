
import java.util.Scanner;

public class CtoFTableDisplay
{
    public static void main (String[]args)
    {
        double celDegrees = 0;
        Scanner in = new Scanner(System.in);

        celDegrees = CtoFTableDisplay.CtoF(in, "Enter the temperature in C that you want to convert to F:  ", -100,100);


    }


    public static double CtoF(Scanner pipe, String prompt, double low, double high)
    {
        double celsius = 0;
        boolean done = false;
        String trash = "";
        double fahrenheit = 0;


        do {
            System.out.println("\n" + prompt + "[" + low + "\t-\t" + high + "]: ");
            if (pipe.hasNextDouble())
            {
                celsius = pipe.nextDouble();
                pipe.nextLine();
                if (celsius >= low && celsius <= high)
                {
                    done = true;
                } else {
                    System.out.println("\nNumber is out of range [" + low + "\t-\t" + high + "]: " + celsius);
                }
            } else
            {
                trash = pipe.nextLine();
                System.out.println("Enter a valid answer and not: " + trash);
            }
        } while(!done);

        System.out.println("-----------------------------------------------------------");

            for ( double i = celsius; i <= 100; i++ )
            {
                fahrenheit = (celsius * 1.8) + 32;
                System.out.printf("Celsius:%10.2f \t\t\tFahrenheit:%10.2f", celsius, fahrenheit);
                System.out.println();
                celsius = ++celsius;
            }
        return celsius;
    }
}
