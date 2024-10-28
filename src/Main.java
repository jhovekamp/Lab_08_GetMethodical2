import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int birthYear = 0;
        int birthMonth = 0;
        int birthDay = 0;
        int birthHours = 0;
        int birthMins = 0;
        birthYear = SafeInput.getRangedInt(in, "Enter your birth year ", 1900, 2024);
        birthMonth = SafeInput.getRangedInt(in, "Enter your birth month ", 1, 12);
        birthDay = SafeInput.getRangedInt(in, "Enter your birth day ", 1, 31);
        birthHours= SafeInput.getRangedInt(in, "Enter the hour you were born ", 0,24);
        birthMins= SafeInput.getRangedInt(in, "Enter the minute you were born ", 0,60);
        System.out.println("Birth year is: " + birthYear);
        System.out.println("Birth month is: " + birthMonth);
        System.out.println("Birth day is: " + birthDay);
        System.out.println("Birth hour is: " + birthHours);
        System.out.println("Birth minute is: " + birthMins);
    }
}