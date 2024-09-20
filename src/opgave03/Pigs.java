package opgave03;

import java.util.Scanner;

public class Pigs {
    // Variabler til at holde styr på point og rundetotaler
    private static int player01total = 0;  // Total score for spiller 1
    private static int player02total = 0;  // Total score for spiller 2
    private static int rundetotal = 0;     // Samlet score for den nuværende runde
    private static int Spillertil = 0;     // Målet som spillerne skal nå for at vinde

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Spørger, hvad målet er for spillet
        System.out.println("Hvad vil I spille til?");
        Spillertil = scanner.nextInt();

        printRules(); // Udskriver reglerne

        // Starter spillet ved at spørge, hvem der starter
        System.out.println("Hvem spiller? For spiller 1 tryk 1, for spiller 2 tryk 2.");
        int answer = scanner.nextInt();

        // Spillet kører indtil en af spillerne vinder
        while (answer != 1 && answer != 2) {
            if (answer == 1) { // Spiller 1's tur
                System.out.println("Spiller 1, det er din tur");
                System.out.println("Din totale score er " + player01total);
                SpilEnRunde(); // Spiller en runde
                player01total += rundetotal; // Opdaterer spiller 1's total
                CheckVinder(); // Tjekker om der er en vinder
                System.out.println("Din total er " + player01total);
                answer = 2; // Skift til spiller 2
            } else if (answer == 2) { // Spiller 2's tur
                System.out.println("Spiller 2, det er din tur");
                System.out.println("Din totale score er " + player02total);
                SpilEnRunde(); // Spiller en runde
                player02total += rundetotal; // Opdaterer spiller 2's total
                CheckVinder(); // Tjekker om der er en vinder
                System.out.println("Din total er " + player02total);
                answer = 1; // Skift til spiller 1
            }
        }
    }

    // Simulerer rulning af en terning (tilfældigt tal mellem 1 og 6)
    public static int roll() {
        return (int) (Math.random() * 6 + 1);
    }

    // Spiller en runde hvor spilleren vælger om de vil fortsætte med at rulle terningen
    public static void SpilEnRunde() {
        rundetotal = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vil du rulle en terning? ('ja/nej')");
        String answer = scanner.nextLine();

        // Spilleren ruller indtil de vælger at stoppe eller slår en 1'er
        while (!answer.equals("nej")) {
            int roll = roll(); // Ruller terningen
            while (roll != 0) {
                // Spilleren stopper runden
                if (answer.equals("nej")) {
                    System.out.println("Du har stoppet din tur");
                    return;
                }

                // Udskriver terningens værdi
                System.out.println("Du rullede " + roll);
                rundetotal += roll; // Tilføjer resultatet til rundens total

                // Hvis spilleren ruller en 1'er, afsluttes runden uden point
                if (roll == 1) {
                    System.out.println("Du rullede 1, din tur er slut. Du får ingen point for denne runde.");
                    rundetotal = 0; // Nulstil rundens score
                    return;
                }

                // Spørger om spilleren vil rulle igen
                System.out.print("Vil du rulle en terning ('ja/nej') ");
                System.out.println("Din runde total er " + rundetotal);
                answer = scanner.nextLine();
                roll = roll(); // Ruller igen
            }
        }
    }

    // Tjekker om en spiller har vundet
    private static void CheckVinder() {
        if (player01total >= Spillertil) {
            System.out.println("Spiller 1 har vundet!");
        }
        if (player02total >= Spillertil) {
            System.out.println("Spiller 2 har vundet!");
        }
    }

    // Udskriver spillets regler
    private static void printRules() {
        System.out.println("=====================================================");
        System.out.println("Regler for Pigs:");
        System.out.println("Spilleren ruller en terning, indtil de slår 1 eller vælger at stoppe.");
        System.out.println("Hvis spilleren slår 1, får de ingen point for runden.");
        System.out.println("Hvis de stopper før de slår 1, får de summen af alle kast.");
        System.out.println("Første spiller til " + Spillertil + " vinder.");
        System.out.println("=====================================================");
    }
}




    


