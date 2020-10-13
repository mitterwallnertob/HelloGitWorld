import java.util.Scanner;

/*******************************
 * @class: Main
 * @author: Tobias Mitterwallner
 * @date: 12.10.2020
 ******************************/

public class Main
{
    public static void main(String[] args)
    {
        int x = 0;
        int y = 0;
        int s;
        boolean z = false;

        System.out.println("Addition von 2 eingelesenen Werten");
        System.out.printf("----------------------------------\n");


        while(z == false)
        {
            try
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Ersten Wert eingeben:");
                x = sc.nextInt();
                z = true;
            }

            catch(Exception e)
            {
                System.out.println("Fehler! Bitte erneut versuchen.");
            }
        }


        while(z == true)
        {
            try
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Zweiten Wert eingeben:");
                y = sc.nextInt();
                z = false;
            }

            catch(Exception e)
            {
                System.out.println("Fehler! Versuchen Sie es noch einmal!");
            }
        }

        s = x + y;
        System.out.printf("Ergebnis: %d", s);

        System.out.println("-----------------------------------");
        System.out.println("Bitte geben Sie eine der folgenden Nummern ein um fortzufahren:");
        System.out.println("Addieren(1)");
        System.out.println("Subtrahieren(2)");
        System.out.println("Multiplizieren(3)");
        System.out.println("Dividieren(4)");
        System.out.println("-----------------------------------");


    }
}
