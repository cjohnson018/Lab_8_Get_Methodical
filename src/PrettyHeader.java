public class PrettyHeader
{
    public static void header(String msg)
    {
        for (int i = 0; i < 60; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("**");
        int spaceGap = (56 - msg.length())/2;
        for (int i = 0; i < spaceGap; i++) {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < spaceGap; i++) {
            System.out.print(" "); }
        if ((msg.length() % 2) == 1) {
            System.out.print(" ");
        }
        System.out.println("**");
        for (int i = 0; i < 60; i++) {
            System.out.print("*");
        }
        System.out.println();

    }

    public static void main(String[] args)
    {
        PrettyHeader.header("Even");
        PrettyHeader.header("Odd");
        PrettyHeader.header("This is a long message to test");
        PrettyHeader.header("3");
    }
}
