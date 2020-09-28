import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        double taxRate;
        int numBoards;
        int numWindows;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the sales tax rate:");
        taxRate = in.nextDouble();
        System.out.println("How many boards do you need? ");
        numBoards = in.nextInt();
        System.out.println("How many windows do you need? ");
        numWindows = in.nextInt();


        Construction myConstruction = new Construction(8.0,11.0,taxRate);
        double total = myConstruction.lumberCost(numBoards) + myConstruction.windowCost(numWindows);

        System.out.println("Total: " + total);
        double gTotal =  myConstruction.grandTotal(total);
        System.out.println("Grand total: " + gTotal);
    }
}
