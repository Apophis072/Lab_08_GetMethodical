import java.util.Scanner;

public class CheckOut
{
    public static void main(String[]args)
        {
            Scanner in = new Scanner(System.in);
            double itemPrice;
            boolean response = false;
            double totalPrice = 0;

            do
            {
                itemPrice = SafeInput.getRangedDouble(in, "Enter your item price: ", 0.5, 10);
                response = SafeInput.getYNConfirm(in, "Is that all?");
                totalPrice = totalPrice + itemPrice;

            }while(!response);
            System.out.printf("Your total price is: %15.2f", totalPrice);

    }
}
