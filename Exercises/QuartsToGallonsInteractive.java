import java.util.Scanner;
public class QuartsToGallonsInteractive
{
    public static void main(String[] args)
    {
        final int QUARTSPERGALLON = 4;
        int quartsNeeded;
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("How many quarts of paint do you need? ");
        quartsNeeded = inputDevice.nextInt();
        System.out.println("A job that requires " + quartsNeeded + " quarts requires " + (quartsNeeded/QUARTSPERGALLON)
                + " gallons plus " + (quartsNeeded % QUARTSPERGALLON) + " quarts.");
    }
}
