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
        int s = 0;
        int z = 0;
        int o = 0;


        System.out.println("Addition von 2 eingelesenen Werten");
        System.out.printf("----------------------------------\n");


        while(z == 0)
        {
            try
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Ersten Wert eingeben:");
                x = sc.nextInt();
                z = 1;
            }

            catch(Exception e)
            {
                System.out.println("Fehler! Bitte erneut versuchen.");
            }
        }


        while(z == 1)
        {
            try
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Zweiten Wert eingeben:");
                y = sc.nextInt();
                z = 2;
            }

            catch(Exception e)
            {
                System.out.println("Fehler! Versuchen Sie es noch einmal!");
            }
        }

        s = x + y;
        System.out.printf("Ergebnis: %d %n", s);

        System.out.println("-----------------------------------");
        System.out.println("Bitte geben Sie eine der folgenden Nummern ein um fortzufahren:\n");
        System.out.println("Addieren(1)");
        System.out.println("Subtrahieren(2)");
        System.out.println("Multiplizieren(3)");
        System.out.println("Dividieren(4)");
        System.out.println("-----------------------------------");

        while(z == 2) {
            try {
                Scanner sc = new Scanner(System.in);

                System.out.println("Zahlenkürzel eingeben:");
                o = sc.nextInt();
                z = 3;
            }

            catch(Exception e) {
                System.out.println("Fehler! Versuchen Sie es erneut!");
            }
        }
        
        if(o == 1) {
            s = x + y;
        }
        else if(o == 2) {
            s = x  - y;
        }
        else if(o == 3) {
            s = x  * y;
        }
        else if(o == 4) {
            s = x  / y;
        }

        System.out.println("-----------------------------------");
        System.out.printf("Ergebnis: %d", s);
    }
}
