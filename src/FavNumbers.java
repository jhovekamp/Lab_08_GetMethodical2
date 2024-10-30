import java.util.Scanner;

public class FavNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num = 0;
        double num2 = 0.00;
        num = SafeInput.getInt(in, "Enter your favorite integer");
        num2 = SafeInput.getDouble(in, "Enter your favorite double");
    }

}
