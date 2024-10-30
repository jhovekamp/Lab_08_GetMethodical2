import java.util.Scanner;

public class CtoFTableDisplay
{
    Scanner in = new Scanner(System.in);
    double celsius = 0.0;
    double fahrenheit =0.0;
    String trash = "";
    boolean done = false;
    do{
    System.out.println("Enter temperatrue in celsius: ");
    if(in.hasNextDouble())
    {
        celsius = in.nextDouble();
        in.nextLine();
    }
}
}
