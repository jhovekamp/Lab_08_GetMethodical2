import java.util.Scanner;

public class SafeInput {
    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = ""; // Set this to zero length. Loop runs until it isn't
        do
        {
            System.out.print("\n" +prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;

    }
    public static int getInt(Scanner pipe, String prompt)
    {
        int num = 0;
        boolean done = false;
        String trash = "";
        do
        {
            System.out.print(prompt +": ");
            if(pipe.hasNextInt())
            {
                num = pipe.nextInt();
                pipe.nextLine();
                done = true;
                System.out.println("Your favorite integer is: " + num);
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an int: " + trash);
            }
        }while(!done);
        return num;
    }
    public static double getDouble(Scanner pipe, String prompt)
    {
        double num = 0;
        boolean done = false;
        String trash = "";
        do
        {
            System.out.print(prompt +": ");
            if(pipe.hasNextDouble())
            {
                num = pipe.nextDouble();
                pipe.nextLine();
                done = true;
                System.out.println("Your favorite double is: " + num);
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a double: " + trash);
            }
        }while(!done);
        return num;
    }

    public static int getRangedInt (Scanner pipe, String prompt, int lo, int hi)
    {
        int result = 0;
        boolean done = false;
        String trash = "";
        do
        {
            System.out.print(prompt + "[" + lo + "-" + hi + "]: ");
            if(pipe.hasNextInt())
            {
                result = pipe.nextInt();
                pipe.nextLine();
                if(result >= lo && result <= hi)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a value in range ["+ lo + " - " + hi + "]: " + result);
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an int ["+ lo + " - " + hi + "]: " + trash);
            }
        }while(!done);

        return result;
    }
    public static double getRangedDouble (Scanner pipe, String prompt, double lo, double hi)
    {
        double result = 1.00;
        boolean done = false;
        String trash = "";
        do
        {
            System.out.print(prompt + "[" + lo + "-" + hi + "]: ");
            if(pipe.hasNextDouble())
            {
                result = pipe.nextDouble();
                pipe.nextLine();
                if(result >= lo && result <= hi)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a value in range ["+ lo + " - " + hi + "]: " + result);
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an int ["+ lo + " - " + hi + "]: " + trash);
            }
        }while(!done);

        return result;
    }
    public static String getRegExString(Scanner pipe, String prompt, String regExPattern)
    {
        String value = "";
        boolean gotAValue = false;

        do{
            System.out.print(prompt + ": ");
            value = pipe.nextLine();
            if(value.matches(regExPattern))
            {
                gotAValue = true;
            }
            else
            {
                System.out.println("\nInvalid input: " + value);
            }

        }while(!gotAValue);

        return value;
    }
}
