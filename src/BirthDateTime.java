import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birthYear = 0;
        int birthMonth = 0;
        int birthDay = 0;
        int birthHours = 0;
        int birthMins = 0;
        birthYear = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015);
        birthMonth = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);
        switch(birthMonth)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                birthDay = SafeInput.getRangedInt(in, "Enter your birth day", 1, 31);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                birthDay = SafeInput.getRangedInt(in, "Enter your birth day", 1, 30);
                break;
            case 2:
                birthDay = SafeInput.getRangedInt(in, "Enter your birth day", 1, 29);
                break;
        }

        birthHours = SafeInput.getRangedInt(in, "Enter the hour you were born", 1, 24);
        birthMins = SafeInput.getRangedInt(in, "Enter the minutes you were born", 1, 59);
        System.out.println("Your were born " + birthMonth + "/" + birthDay + "/" + birthYear + " at " + birthHours + ":" + birthMins);
    }

}
