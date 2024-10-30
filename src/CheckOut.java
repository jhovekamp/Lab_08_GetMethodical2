import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double range = 0.00;
        boolean input = false;
        boolean done = false;

        range = SafeInput.getRangedDouble(in, "Enter the price of your item", .50, 10.00);
       do
       {

               input = SafeInput.getYNConfirm(in, "Do you have more items? ");
               if(input = true)
               {
                   range = SafeInput.getRangedDouble(in, "Enter the price of your item", .50, 10.00);
                   range += range;
                   done = true;
               }
                else
                {
                    done = false;
                }

       }while(!done);
        System.out.printf("Your items total is: " + "%.2f", +range);
    }
}
