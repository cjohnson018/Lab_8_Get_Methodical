import java.util.Scanner;

public class SafeInput
{

    /**
     * returns a String input by the user that must be at least one character
     * @param pipe the scanner to use the input
     * @param prompt the msg for the user telling them what to input
     * @return a String of at least one character
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        boolean done = false;
        String response = "";

        do
        {
            System.out.print(prompt +": ");
            response = pipe.nextLine();

            if(response.length() > 0)
                done = true;
            else
                System.out.println("\nYou must enter at least one character!\n");

        }while(!done);

        return response;
    }
    /**
     * gets an int val from the user with no constraints
     * @param pipe scanner to use for the input
     * @param prompt msg to user for what to enter
     * @return any valid int
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        boolean done = false;
        String trash = "";
        int value = 0;

        do
        {
            System.out.print(prompt +": ");
            if(pipe.hasNextInt())
            {
                value = pipe.nextInt();
                pipe.nextLine();//Clear the buffer
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("\nYou must enter a number. You entered: " + trash);
            }

        }while(!done);

        return value;
    }
    /**
     * returns an unconstrained double
     * @param pipe Scanner to use for input
     * @param prompt msg to tell user what to input
     * @return an unconstrained double value
     */
    public static double getDouble(Scanner pipe, String prompt)
    {
        boolean done = false;
        String trash = "";
        double value = 0;

        do
        {
            System.out.print(prompt +": ");
            if(pipe.hasNextDouble())
            {
                value = pipe.nextDouble();
                pipe.nextLine();//Clear the buffer
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("\nYou must enter a number. You entered: " + trash);
            }

        }while(!done);

        return value;
    }
    /**
     * gets an int val from the user with no constraints
     * @param pipe scanner to use for the input
     * @param prompt msg to user for what to enter
     * @param low the bottom value for the inclusive range
     * @param high the top value for the inclusive range
     * @return any valid int
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        boolean done = false;
        String trash = "";
        int value = 0;

        do
        {
            System.out.print(prompt +"[" + low + " - " + high + "]: ");
            if(pipe.hasNextInt())
            {
                value = pipe.nextInt();
                pipe.nextLine();//Clear the buffer

                if(value >= low && value <= high)
                    done = true;
                else
                    System.out.println("\nYou must enter a value within the range [" + low + " - " + high + "]: " + value);
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("\nYou must enter a number. You entered: " + trash);
            }

        }while(!done);

        return value;
    }

    /**
     * gets a double val within an inclusive range
     * @param pipe scanner to use for the input
     * @param prompt msg to user for what to enter
     * @param low the low bound for the inclusive range
     * @param high the high bound for the inclusive range
     * @return any valid double within the inclusive range
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        boolean done = false;
        String trash = "";
        double value = 0;

        do
        {
            System.out.print(prompt +"[" + low + " - " + high + "]: ");
            if(pipe.hasNextDouble())
            {
                value = pipe.nextDouble();
                pipe.nextLine();//Clear the buffer

                if(value >= low && value <= high)
                    done = true;
                else
                    System.out.println("\nYou must enter a value within the range [" + low + " - " + high + "]: " + value);
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("\nYou must enter a number. You entered: " + trash);
            }

        }while(!done);

        return value;
    }
}
