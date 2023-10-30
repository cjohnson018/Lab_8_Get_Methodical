import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double totalPrice = 0;
        boolean stillShopping = true;
        while (stillShopping)
        {
            totalPrice += SafeInput.getRangedDouble(in, "Enter the price of your item: ", .50, 10.00);
            stillShopping = SafeInput.getYNConfirm(in, "Are you still shopping? ");
        }
        System.out.printf("Your Total Price is $%.2f", totalPrice);
    }
}
