import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String ssnRegEx = "^\\d{3}-\\d{2}-\\d{4}$";
        String MNumberRegEx = "^[Mm]\\d{5}$";
        String MenuChoiceRegEx = "^^[OoSsVvQq]$";
        String SSN = SafeInput.getRegExString(in, "Enter your SSN", ssnRegEx);
        String MNumber = SafeInput.getRegExString(in, "Enter your M-Number", MNumberRegEx);
        String menuChoice = SafeInput.getRegExString(in, "Please pick an option", MenuChoiceRegEx);
        System.out.println("Your SSN is: " + SSN);
        System.out.println("Your M-Number is: " + MNumber);
        System.out.println("You picked the option of: " + menuChoice);
    }
}
