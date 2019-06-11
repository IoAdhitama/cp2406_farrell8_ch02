import java.util.Scanner;

public class Eggs
{
    public static void main(String[] args)
    {
        int amount;
        double totalPrice;
        final double PRICE_PER_DOZEN = 3.25;
        final double PRICE_PER_PIECE = 0.45;

        Scanner inputDevice = new Scanner(System.in);
        System.out.print("How much eggs are you buying? >> ");
        amount = inputDevice.nextInt();

        totalPrice = (amount / 12 * PRICE_PER_DOZEN) + (amount % 12 * PRICE_PER_PIECE);

        System.out.println("You ordered " + amount + " eggs. That's " + (amount / 12)
                + " dozens at $3.25 per dozen and " + (amount % 12) + " loose eggs at 45 cents each for a total of $"
                + totalPrice + ".");
    }
}
