import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String SSN = "";
        String UCM = "";
        String menu = "";
        String menuRegEx = "[OoSsVvQq]";

        boolean done = false;
        SSN = SafeInput.getRegExString(in, "Enter your SSN", "\\d{3}-\\d{2}-\\d{4}");
        UCM = SafeInput.getRegExString(in, "Enter your Student M Number", "(M|m)\\d{5}");

        String menuText = "O- Open\tS - Save\tV - View\tQ - Quit";
        do{
            System.out.println(menuText);
            menu = SafeInput.getRegExString(in,"Enter your menu choice", menuRegEx);
            menu = menu.toUpperCase();
            System.out.println("You chose " +menu);
            switch(menu)
            {
                case "M":
                    break;
                case "S":
                    break;
                case "V":
                    break;
                case "Q":
                    System.exit(0);
                    break;

            }
        }while (!done);
    }
}
