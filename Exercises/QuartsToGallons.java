public class QuartsToGallons
{
    public static void main(String[] args)
    {
        final int QUARTSPERGALLON = 4;
        int quartsNeeded = 18;
        System.out.println("A job that requires " + quartsNeeded + " quarts requires " + (quartsNeeded/QUARTSPERGALLON)
            + " gallons plus " + (quartsNeeded % QUARTSPERGALLON) + " quarts.");
    }
}
