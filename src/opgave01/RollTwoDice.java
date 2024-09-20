

package opgave01;

import java.util.Scanner;

public class RollTwoDice {
    // Variabler til at gemme statistik
    private static int rollCount = 0; // Antal kast
    private static int summenAfKAst = 0; // Sum af alle kast
    private static int SammeTal = 0; // Antal gange med samme terningværdi
    private static int højesteTal = 0; // Højeste sum af kast
    private static int[] totalsumofdice = new int[6]; // Tæller for hver terningværdi (1-6)

    public static void main(String[] args) {
        // Velkomst og regler
        System.out.println("Velkommen til spillet, rul en terning.");
        printRules();
        System.out.println();

        playOneDie(); // Start spillet

        // Tak for spillet
        System.out.println();
        System.out.println("Tak for at spille, rul en terning.");
    }

    // Udskriver reglerne
    private static void printRules() {
        System.out.println("=====================================================");
        System.out.println("Regler for rul en terning");
        System.out.println("Spilleren ruller en terning, så længe man lyster.");
        System.out.println("=====================================================");
    }

    // Spillerens mulighed for at rulle terninger flere gange
    private static void playOneDie() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Rul en terning? ('ja/nej') ");
        String answer = scanner.nextLine();

        // Looper indtil spilleren vælger "nej"
        while (!answer.equals("nej")) {
            int[] terninger = rollDice(); // Ruller terninger
            System.out.println("Du rullede: " + terninger[0] + " og " + terninger[1]);
            System.out.println();

            updateStatistics(terninger); // Opdaterer statistik

            System.out.println("Rul en terning? ('ja/nej')");
            answer = scanner.nextLine();
        }

        printStatistics(); // Udskriver statistik
        scanner.close(); // Lukker scanner
    }

    // Simulerer rulning af to terninger
    private static int[] rollDice() {
        int[] terniger = new int[2];
        for (int i = 0; i < terniger.length; i++) {
            terniger[i] = (int) (Math.random() * 6) + 1; // Tilfældigt tal mellem 1 og 6
        }
        return terniger;
    }

    // Opdaterer statistik for hver terningrulning
    private static void updateStatistics(int[] terninger) {
        summenAfKAst += terninger[0] + terninger[1];

        // Hvis begge terninger er ens
        if (terninger[0] == terninger[1]) {
            SammeTal++;
        }

        // Opdaterer højeste sum af kast
        if (højesteTal < terninger[0] + terninger[1]) {
            højesteTal = terninger[0] + terninger[1];
        }

        // Tæller antallet af hver terningværdi
        totalsumofdice[terninger[0] - 1]++;
        totalsumofdice[terninger[1] - 1]++;

        rollCount++; // Øger antal kast
    }

    // Udskriver den samlede statistik efter spillet
    private static void printStatistics() {
        System.out.println("\nResults:");
        System.out.println("-------");
        System.out.printf("%17s %4d\n", "Antal rul:", rollCount);
        System.out.println("Totale sum af alle kast = " + summenAfKAst);
        System.out.println("Antal gange terningerne var det samme = " + SammeTal);
        System.out.println("Det højeste tal er " + højesteTal);

        // Udskriver hvor mange gange hver værdi blev rullet
        System.out.println("Så mange gange har du slået 1: " + totalsumofdice[0]);
        System.out.println("Så mange gange har du slået 2: " + totalsumofdice[1]);
        System.out.println("Så mange gange har du slået 3: " + totalsumofdice[2]);
        System.out.println("Så mange gange har du slået 4: " + totalsumofdice[3]);
        System.out.println("Så mange gange har du slået 5: " + totalsumofdice[4]);
        System.out.println("Så mange gange har du slået 6: " + totalsumofdice[5]);
    }
}
