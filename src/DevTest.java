import java.util.Scanner;

public class DevTest
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String SSN = "";
        SSN = SafeInput.getRegExString(in, "Enter your SSN ", "\\d{3}-\\d{2}-\\d{4}");
    }
}